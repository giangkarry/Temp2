package Dictionary;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TalkResource {


    private static final String VOICENAME_kevin = "kevin16";

    public TalkResource(String sayText) {
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice(VOICENAME_kevin);
        voice.allocate();

        voice.speak(sayText);
    }

    public static void main(String []args) {
        new TalkResource("Don't tell me you can't");
    }
}
