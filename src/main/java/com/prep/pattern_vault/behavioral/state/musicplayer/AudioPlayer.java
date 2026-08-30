package com.prep.pattern_vault.behavioral.state.musicplayer;

public class AudioPlayer {
    private AudioState audioState;

    public AudioPlayer() {
        this.audioState = new StoppedAudioState();
    }


    public void pressPausePlay(){
        audioState.pressPausePlayButton(this);
    }

    public void pressStop(){
        audioState.pressStopButton(this);
    }

    public void pressFastForward(){
        audioState.pressFastForwardButton(this);
    }

    public void pressRewind(){
        audioState.pressRewindButton(this);
    }

    protected void playMusic(){
        System.out.println("Playing the music");
    }

    protected void pauseMusic(){
        System.out.println("Paused the music");
    }

    protected void fastForwardMusic(){
        System.out.println("Fast forwarding the music");
    }

    protected void rewindMusic(){
        System.out.println("Rewinding Music");
    }

    protected void stopMusic(){
        System.out.println("Music Stopped");
    }

    protected void setAudioState(AudioState audioState) {
        this.audioState = audioState;
    }

    public String getAudioState() {
        return audioState.stateName().name();
    }
}
