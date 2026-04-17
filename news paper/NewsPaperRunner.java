class NewsPaperRunner {

    public static void main(String[] args) {

        NewsPaperStore store = new NewsPaperStore();

        NewsPaper newsPaper1 = new NewsPaper(Lang.ENGLISH, "High", 5.0, 24, "The Times of India",
                30.5, 200, "India's Leading Daily", "Stay Ahead with News",
                12, 6, "Rohit Sharma", "Bangalore", InkColor.BLACK, 12);

        NewsPaper newsPaper2 = new NewsPaper(Lang.ENGLISH, "Medium", 4.0, 20, "Vijaya Karnataka",
                28.5, 180, "Top Stories of the Day", "Your Daily News Source",
                11, 5, "Suresh Bhat", "Mysore", InkColor.BLUE, 10);

        NewsPaper newsPaper3 = new NewsPaper(Lang.ENGLISH, "High", 5.5, 22, "Prajavani",
                30.0, 190, "Voice of the People", "Reliable and Honest News",
                12, 6, "Lakshmi Rao", "Bangalore", InkColor.BLACK, 11);

        NewsPaper newsPaper4 = new NewsPaper(Lang.ENGLISH, "High", 6.0, 26, "The Hindu",
                31.0, 210, "Trusted Journalism", "Truth Above All",
                13, 7, "Anil Kumar", "Chennai", InkColor.BLACK, 13);

        NewsPaper newsPaper5 = new NewsPaper(Lang.ENGLISH, "Medium", 4.5, 19, "Udayavani",
                29.0, 170, "A Fresh Start to Your Day", "Your Trusted Newspaper",
                11, 5, "Gagan Shetty", "Manipal", InkColor.BLUE, 9);

        NewsPaper newsPaper6 = new NewsPaper(Lang.ENGLISH, "Low", 3.5, 16, "Kannada Prabha",
                28.0, 160, "Simple and Clear News", "Daily News for Everyone",
                10, 4, "Aditya Rao", "Bangalore", InkColor.RED, 8);

        NewsPaper newsPaper7 = new NewsPaper(Lang.ENGLISH, "High", 5.8, 23, "Samyukta Karnataka",
                30.2, 195, "Complete News Coverage", "Accurate Information",
                12, 6, "Veeresh Patil", "Hubli", InkColor.BLACK, 12);

        NewsPaper newsPaper8 = new NewsPaper(Lang.ENGLISH, "Medium", 4.2, 18, "Deccan Herald",
                27.5, 155, "Voice of South India", "Reliable News Everyday",
                11, 4, "Mohit Reddy", "Bangalore", InkColor.BLUE, 8);

        NewsPaper newsPaper9 = new NewsPaper(Lang.ENGLISH, "Low", 3.8, 15, "Vartha Bharati",
                26.5, 140, "Social and Community News", "People's Voice",
                10, 3, "Saniya Khan", "Mangalore", InkColor.RED, 7);

        NewsPaper newsPaper10 = new NewsPaper(Lang.ENGLISH, "High", 6.2, 28, "Indian Express",
                32.0, 220, "Journalism of Courage", "Nation Comes First",
                14, 7, "Riya Verma", "Delhi", InkColor.BLACK, 14);

        // SAVE
        System.out.println("\n--- SAVE OPERATION ---");

        store.save(newsPaper1);
        store.save(newsPaper2);
        store.save(newsPaper3);
        store.save(newsPaper4);
        store.save(newsPaper5);
        store.save(newsPaper6);
        store.save(newsPaper7);
        store.save(newsPaper8);
        store.save(newsPaper9);
        store.save(newsPaper10);

        store.displayAll();

        
        System.out.println("\n--- FIND OPERATION ---");

        String run1 = store.findPaperQualityByName("The Times of India");
        System.out.println("Paper Quality: " + run1);

        int run2 = store.findNoOfPagesByNameAndHeadEditor("Vijaya Karnataka", "Suresh Bhat");
        System.out.println("Pages: " + run2);

       
        System.out.println("\n--- UPDATE OPERATION ---");

        store.updateLangByName("The Times of India", Lang.HINDI);

        store.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(
                InkColor.GREEN, 10, 15, "The Times of India", 30.5, 200);

        store.displayAll();

        
        System.out.println("\n--- REPLACE OPERATION ---");

        NewsPaper replaceNewsPaper = new NewsPaper(Lang.ENGLISH, "High", 6.0, 25,
                "Special Edition", 31.0, 210,
                "Exclusive Breaking News", "Today's Highlights",
                14, 6, "Shashikala Rao", "Karnataka", InkColor.BLACK, 12);

        store.replaceByPrintHouseAddress("Delhi", replaceNewsPaper);

        store.displayAll();
    }
}