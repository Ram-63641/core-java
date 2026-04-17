class NewsPaper {

    Lang lang;
    String paperQuality;
    double price;
    int noOfPages;
    String name;
    double height;
    double weight;
    String headerText;
    String footerText;
    int fontSize;
    int noOfImages;
    String headEditor;
    String printHouseAddress;
    InkColor inkColor;
    int noOfContents;

    
    NewsPaper(Lang lang, String paperQuality, double price, int noOfPages, String name,
              double height, double weight, String headerText, String footerText,
              int fontSize, int noOfImages, String headEditor,
              String printHouseAddress, InkColor inkColor, int noOfContents) {

        this.lang = lang;
        this.paperQuality = paperQuality;
        this.price = price;
        this.noOfPages = noOfPages;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.headerText = headerText;
        this.footerText = footerText;
        this.fontSize = fontSize;
        this.noOfImages = noOfImages;
        this.headEditor = headEditor;
        this.printHouseAddress = printHouseAddress;
        this.inkColor = inkColor;
        this.noOfContents = noOfContents;
    }

    
    void show() {
       
        System.out.println("Name: " + name);
        System.out.println("Language: " + lang);
        System.out.println("Paper Quality: " + paperQuality);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + noOfPages);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Header: " + headerText);
        System.out.println("Footer: " + footerText);
        System.out.println("Font Size: " + fontSize);
        System.out.println("Images: " + noOfImages);
        System.out.println("Head Editor: " + headEditor);
        System.out.println("Print House Address: " + printHouseAddress);
        System.out.println("Ink Color: " + inkColor);
        System.out.println("Contents: " + noOfContents);
        
    }
}