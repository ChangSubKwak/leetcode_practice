package leetcode;

import java.util.*;

public class LC2115_Find_All_Possible_Recipes_from_Given_Supplies {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        LinkedList<String> recipesList = new LinkedList<>(Arrays.asList(recipes));

        Map<String, Set<String>> ingredientsMap = new HashMap<>();
        for (int i = 0; i < ingredients.size(); i++) {
            ingredientsMap.put(recipes[i], new HashSet<>(ingredients.get(i)));
        }

        Set<String> suppliesSet = new HashSet<>();
        for (int i = 0; i < supplies.length; i++) {
            suppliesSet.add(supplies[i]);
        }

        List<String> result = new ArrayList<>();
        while (true) {
            boolean isNecessaryBreak = true;
            for (int i = 0; i < recipesList.size(); i++) {
                if (suppliesSet.containsAll(ingredients.get(i))) {
                    suppliesSet.add(recipesList.get(i));
                    result.add(recipesList.get(i));

                    recipesList.remove(i);
                    ingredients.remove(i);

                    isNecessaryBreak = false;
                    break;
                }
            }

            if (isNecessaryBreak) {
                break;
            }
        }

        return result;
    }
}
