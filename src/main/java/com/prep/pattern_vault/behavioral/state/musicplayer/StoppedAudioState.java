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
        audioPlayer.setAudioState(new RewindAudioState());
        audioPlayer.rewindMusic();
    }

    @Override
    public void pressFastForwardButton(AudioPlayer audioPlayer) {
        audioPlayer.setAudioState(new FastforwardAudioState());
        audioPlayer.fastForwardMusic();
    }

    @Override
    public PlayerState stateName() {
        return PlayerState.STOPPED;
    }
}
