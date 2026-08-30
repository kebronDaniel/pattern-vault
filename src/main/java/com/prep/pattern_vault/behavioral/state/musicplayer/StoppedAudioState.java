package com.prep.pattern_vault.behavioral.state.musicplayer;

public class StoppedAudioState implements AudioState {

    @Override
    public void pressPausePlayButton(AudioPlayer audioPlayer) {
        audioPlayer.setAudioState(new PlayAudioState());
        audioPlayer.playMusic();
    }

    @Override
    public void pressStopButton(AudioPlayer audioPlayer) {
        System.out.println("Music is already stopped");
    }

    @Override
    public void pressRewindButton(AudioPlayer audioPlayer) {
        System.out.println("Nothing is playing to rewind");
    }

    @Override
    public void pressFastForwardButton(AudioPlayer audioPlayer) {
        System.out.println("Nothing is playing to fast forward");
    }

    @Override
    public PlayerState stateName() {
        return PlayerState.STOPPED;
    }
}
