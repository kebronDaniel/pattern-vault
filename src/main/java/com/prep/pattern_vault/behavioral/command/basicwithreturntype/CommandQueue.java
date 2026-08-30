package com.prep.pattern_vault.behavioral.command.basicwithreturntype;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CommandQueue {

    private final Queue<Command<?>> commands = new ArrayDeque<>();

    public void submitCommand(Command<?> command){
        commands.add(command);
    }

    public Object executeCommand(){
        if (commands.isEmpty()) return null;
        return commands.poll().execute();
    }

    public List<Object> executeAll(){
        List<Object> results = new ArrayList<>();
        Command<?> command;
        // when you call poll even for comparison it polls it so the next execute would poll another one.
        while ((command = commands.poll()) != null) results.add(command.execute());
        return results;
    }
}
