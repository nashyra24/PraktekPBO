package Praktikum10;

public class Webpage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override
    public String getPrintableContent() {
        String temp = "URL: " + url + "\n";
        temp += "Title: " + title + "\n";
        temp += "Content: " + content.replaceAll("<[^>]*>", "");
        return temp;
    }
}