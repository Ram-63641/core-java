class FoodItem {

    static String[] getIngredients(String item) {

        if(item == null){
            System.out.println("item is invalid");
            return null;
        }

        if(item.equals("biryani")){
            String[] ing = {"rice","water","chicken","masala"};
            return ing;
        }

        if(item.equals("dosa")){
            String[] ing = {"rice","urad dal"};
            return ing;
        }

        if(item.equals("pasta")){
            String[] ing = {"pasta","sauce"};
            return ing;
        }

        if(item.equals("idli")){
            String[] ing = {"rice","urad dal"};
            return ing;
        }

        if(item.equals("chapati")){
            String[] ing = {"wheat","water"};
            return ing;
        }

        if(item.equals("pizza")){
            String[] ing = {"maida","cheese"};
            return ing;
        }

        if(item.equals("burger")){
            String[] ing = {"bun","patty"};
            return ing;
        }

        if(item.equals("fried rice")){
            String[] ing = {"rice","vegetables"};
            return ing;
        }

        if(item.equals("noodles")){
            String[] ing = {"noodles","sauce"};
            return ing;
        }

        if(item.equals("samosa")){
            String[] ing = {"maida","potato"};
            return ing;
        }

        if(item.equals("vada")){
            String[] ing = {"dal","oil"};
            return ing;
        }

        if(item.equals("poha")){
            String[] ing = {"poha","onion"};
            return ing;
        }

        if(item.equals("upma")){
            String[] ing = {"rava","water"};
            return ing;
        }

        if(item.equals("paneer curry")){
            String[] ing = {"paneer","spices"};
            return ing;
        }

        if(item.equals("dal")){
            String[] ing = {"lentils","water"};
            return ing;
        }

        if(item.equals("rajma")){
            String[] ing = {"rajma","spices"};
            return ing;
        }

        if(item.equals("chole")){
            String[] ing = {"chickpeas","spices"};
            return ing;
        }

        if(item.equals("paratha")){
            String[] ing = {"wheat","oil"};
            return ing;
        }

        if(item.equals("omelette")){
            String[] ing = {"egg","salt"};
            return ing;
        }

        if(item.equals("sandwich")){
            String[] ing = {"bread","butter"};
            return ing;
        }

        if(item.equals("cake")){
            String[] ing = {"flour","sugar"};
            return ing;
        }

        if(item.equals("ice cream")){
            String[] ing = {"milk","sugar"};
            return ing;
        }

        if(item.equals("halwa")){
            String[] ing = {"rava","sugar"};
            return ing;
        }

        if(item.equals("kheer")){
            String[] ing = {"milk","rice"};
            return ing;
        }

        if(item.equals("pani puri")){
            String[] ing = {"puri","water"};
            return ing;
        }

        if(item.equals("maggi")){
            String[] ing = {"noodles","masala"};
            return ing;
        }

        if(item.equals("tea")){
            String[] ing = {"water","tea powder"};
            return ing;
        }

        if(item.equals("coffee")){
            String[] ing = {"milk","coffee"};
            return ing;
        }

        if(item.equals("juice")){
            String[] ing = {"fruit","water"};
            return ing;
        }

        if(item.equals("salad")){
            String[] ing = {"vegetables","salt"};
            return ing;
        }

        if(item.equals("soup")){
            String[] ing = {"water","vegetables"};
            return ing;
        }

        return null;
    }
}