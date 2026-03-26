class FoodRunner {
    public static void main(String[] args) {

        String[] ingred = FoodItem.getIngredients("biryani");

        if(ingred != null){
            System.out.println("length : " + ingred.length);

            for(String ref : ingred){
                System.out.println(ref);
            }
        }

        String[] items = {
            "dosa","pasta","idli","chapati","pizza","burger",
            "fried rice","noodles","samosa","vada","poha","upma",
            "paneer curry","dal","rajma","chole","paratha","omelette",
            "sandwich","cake","ice cream","halwa","kheer","pani puri",
            "maggi","tea","coffee","juice","salad","soup"
        };

        for(String item : items){

            String[] ing = FoodItem.getIngredients(item);

            if(ing != null){
                System.out.println("length : " + ing.length);

                for(String ref : ing){
                    System.out.println(ref);
                }
            }
        }
    }
}