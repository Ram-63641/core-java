class NewsPaperStore {

    NewsPaper[] newspapers = new NewsPaper[100];
    int index;

    void save(NewsPaper newsPaper) {
        if (newsPaper != null) {
            if (index < newspapers.length) {
                newspapers[index] = newsPaper;
                System.out.println("Newspaper saved at index " + index);
                index++;
            } 
        } 
		else {
            System.out.println("NewsPaper is null");
        }
    }

    void displayAll() {
        System.out.println("DISPLAY ALL ");

        boolean found = false;

        for (NewsPaper paper : newspapers) {
            if (paper != null) {
                paper.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No NewsPapers found");
        }
    }

    NewsPaper findByName(String name) {
        if (name != null) {
            for (NewsPaper paper : newspapers) {
                if (paper != null && paper.name.equals(name)) {
                    System.out.println("NewsPaper found");
                    paper.show();
                    return paper;
                }
            }
        }
        System.out.println("Not found");
        return null;
    }

    String findPaperQualityByName(String name) {
        if (name != null) {
            for (NewsPaper paper : newspapers) {
                if (paper != null && paper.name.equals(name)) {
                    return paper.paperQuality;
                }
            }
        }
        return null;
    }

    int findNoOfPagesByNameAndHeadEditor(String name, String headEditor) {
        if (name != null && headEditor != null) {
            for (NewsPaper paper : newspapers) {
                if (paper != null &&
                        paper.name.equals(name) &&
                        paper.headEditor.equals(headEditor)) {

                    return paper.noOfPages;
                }
            }
        }
        return 0;
    }

    
    void updateLangByName(String name, Lang newLang) {
        if (name != null && newLang != null) {
            for (NewsPaper paper : newspapers) {
                if (paper != null && paper.name.equals(name)) {
                    paper.lang = newLang;
                    System.out.println("Language updated");
                    paper.show();
                }
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    void updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(
            InkColor inkColor, int noOfImages, int fontSize,
            String name, double height, double weight) {

        boolean updated = false;

        if (inkColor != null && name != null) {
            for (NewsPaper paper : newspapers) {
                if (paper != null &&
                        paper.name.equals(name) &&
                        paper.height == height &&
                        paper.weight == weight) {

                    paper.inkColor = inkColor;
                    paper.noOfImages = noOfImages;
                    paper.fontSize = fontSize;

                    System.out.println("Updated");
                    paper.show();
                    updated = true;
                }
            }

            if (!updated) {
                System.out.println("No match found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    void replaceByPrintHouseAddress(String address, NewsPaper newPaper) {

        boolean replaced = false;

        if (address != null && newPaper != null) {
            for (int i = 0; i < newspapers.length; i++) {

                if (newspapers[i] != null &&
                        newspapers[i].printHouseAddress.equals(address)) {

                    newspapers[i] = newPaper;
                    System.out.println("Replaced at index " + i);
                    replaced = true;
                }
            }

            if (!replaced) {
                System.out.println("No match found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}