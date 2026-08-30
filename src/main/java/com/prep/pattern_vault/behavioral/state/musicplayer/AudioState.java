package com.prep.pattern_vault.behavioral.state.musicplayer;

public interface AudioState {
    void pressPausePlayButton(AudioPlayer audioPlayer);
    void pressStopButton(AudioPlayer audioPlayer);
    void pressRewindButton(AudioPlayer audioPlayer);
    void pressFastForwardButton(AudioPlayer audioPlayer);
    PlayerState stateName();
}
