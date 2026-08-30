package com.prep.pattern_vault.behavioral.state.musicplayer;

public class RewindAudioState implements AudioState {
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
        System.out.println("Already rewinding the music");
    }

    @Override
    public void pressFastForwardButton(AudioPlayer audioPlayer) {
        audioPlayer.setAudioState(new FastforwardAudioState());
        audioPlayer.fastForwardMusic();
    }

    @Override
    public PlayerState stateName() {
        return PlayerState.REWINDING;
    }
}
