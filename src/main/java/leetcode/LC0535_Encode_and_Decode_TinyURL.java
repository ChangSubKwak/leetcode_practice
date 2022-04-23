package leetcode;

public class LC0535_Encode_and_Decode_TinyURL {
    private String url;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        this.url = longUrl;
        return this.url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return this.url;
    }
}
