package Dictionary;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TexttoSpeech {
    private String text;
    private static final String voice = "kevin16";

    public TexttoSpeech(String text) {
        this.text = text;
    }
    public void setText(String texttoRead) {
        this.text = texttoRead;
    }

    public void read() {
        if (text == null) {
            throw new NullPointerException();
        }
        //System.setProperty("mbrola.base", "mbrola");
        VoiceManager manager = VoiceManager.getInstance();
        Voice kevin = manager.getVoice(voice); //kevin16
        kevin.allocate();
        kevin.speak(text);
        kevin.deallocate();
    }



    public static void main(String[] args) {
        TexttoSpeech t = new TexttoSpeech("Don't tell me you can't");
        t.read();
    }
}
