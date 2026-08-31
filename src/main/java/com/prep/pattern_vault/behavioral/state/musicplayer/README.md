# State — `musicplayer` (audio player transitions)

Full write-up: [`docs/behavioral/state.md`](../../../../../../../../../docs/behavioral/state.md)

## Structure

| Role | Class |
|---|---|
| Context | `AudioPlayer` — forwards every button press to the current state |
| State interface | `PlayerState` / `AudioState` |
| Concrete states | `StoppedAudioState`, `PlayAudioState`, `PausedAudioState`, `RewindAudioState`, `FastforwardAudioState` |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.state.musicplayer.AudioPlayer;

AudioPlayer player = new AudioPlayer();
System.out.println(player.getAudioState()); // STOPPED

player.pressPausePlay();
System.out.println(player.getAudioState()); // PLAYING

player.pressFastForward();
System.out.println(player.getAudioState()); // FAST_FORWARDING

player.pressStop();
System.out.println(player.getAudioState()); // STOPPED
```
