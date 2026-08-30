package com.prep.pattern_vault.behavioral.state.musicplayer;

public class FastforwardAudioState implements AudioState {

    @Override
    public void pressPausePlayButton(AudioPlayer audioPlayer) {
        audioPlayer.setAudioState(new PlayAudioState());
        audioPlayer.playMusic();
    }

    @Override
    public void pressStopButton(AudioPlayer audioPlayer) {
        audioPlayer.setAudioState(new StoppedAudioState());
        audioPlayer.stopMusic();
    }

    @Override
    public void pressRewindButton(AudioPlayer audioPlayer) {
        audioPlayer.setAudioState(new RewindAudioState());
        audioPlayer.rewindMusic();
    }

    @Override
    public void pressFastForwardButton(AudioPlayer audioPlayer) {
        System.out.println("Already Fast forwarding the music");
    }

    @Override
    public PlayerState stateName() {
        return PlayerState.FAST_FORWARDING;
    }
}
