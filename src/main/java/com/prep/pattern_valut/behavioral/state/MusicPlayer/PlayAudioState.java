package com.prep.pattern_valut.behavioral.state.MusicPlayer;

public class PlayAudioState implements AudioState {
    @Override
    public void pressPausePlayButton(AudioPlayer audioPlayer) {
        audioPlayer.setAudioState(new PausedAudioState());
        audioPlayer.pauseMusic();
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
        audioPlayer.setAudioState(new FastforwardAudioState());
        audioPlayer.fastForwardMusic();
    }

    @Override
    public PlayerState stateName() {
        return PlayerState.PLAYING;
    }
}
