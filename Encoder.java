/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matteo Bartoli
 */
public class Encoder extends Object {
   /**
     * @deprecated 
     * <i>The resulting string may vary depending on the platform's default encoding. Instead, use the encode(String,String) method to specify the encoding.</i>
     * Translates a string into format. This method uses the platform's default encoding as the encoding scheme to obtain the bytes for unsafe characters.x-www-form-urlencoded
     * @param s String to be translated.
     * @return the translated .String
     */
    public static String encode(String s){
        String translated = null;
        return translated;
    }
    /**
     * Translates a string into format using a specific encoding scheme. This method uses the supplied encoding scheme to obtain the bytes for unsafe characters. application/x-www-form-urlencoded
     * <b>Note: </b>The <a href="http://www.w3.org/TR/html40/appendix/notes.html#non-ascii-chars">World Wide Web Consortium Recommendation</a> states that UTF-8 should be used. Not doing so may introduce incompatibilites.
     * @param s String to be translated.
     * @param enc The name of a suported <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html#charenc">character encoding</a>.
     * @return the translated .String
     * @throws UnsupportedEncodingException
     * If the named encoding is not supported
     * @since 1.4
     * @see URLDecoder.decode(java.lang.String, java.lang.String)
     */
    public static String encode(String s, String enc){
        String translated = null;
        return translated;
    }
      
}
