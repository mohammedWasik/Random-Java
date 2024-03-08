package u8.wikiGSON;

public class WikiJsonHandler {
    private String protocol;
    private String domain;
    private int wait;
    private String downloadedFile;
    private String name;


    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public int getWait() {
        return wait;
    }

    public String getHost() {
        return protocol + "://" + domain;
    }

    public String getName() {
        return name;
    }

    public void setDownloadedFile(String downloadedFile) {
        this.downloadedFile = downloadedFile;
    }

    public String getDownloadedFile() {
        return downloadedFile;
    }

    public void setName(String name) {
        this.name = name;
    }
}
