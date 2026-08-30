package com.prep.pattern_vault.behavioral.command.basicwithreturntype;

import java.util.ArrayDeque;
import java.util.Queue;

public class CommandQueue {

    private final Queue<Command> commands = new ArrayDeque<>();

    public void submitCommand(Command command){
        commands.add(command);
    }

    public void executeCommand(){
        if (commands == null) return;
        commands.poll().execute();
    }

    public void executeAll(){
        Command command;
        // when you call poll even for comparison it polls it so the next execute would poll another one.
        while ((command = commands.poll()) != null) command.execute();
    }
}
