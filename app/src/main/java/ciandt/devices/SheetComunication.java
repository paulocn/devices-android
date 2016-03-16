package ciandt.devices;

import ciandt.googleformuploader.GoogleFormUploader;

/**
 * Created by paulocn on 11/03/16.
 */

public class SheetComunication {


    static public void sentAnswerToSheet(String str1, String str2, String str3){
        GoogleFormUploader uploader = new GoogleFormUploader("1YECDun4VL_7P5RusdJGdFsgCs4Pm2E4qBoo33SnACwc");
        uploader.addEntry("566621224", str1);
        uploader.addEntry("1694623885", str2);
        uploader.addEntry("966405076", str3);
        uploader.upload();
    }
}
