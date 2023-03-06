/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



class Proviant {
    private String name;
    private Double price;
    private Integer sort;

    public Proviant(String name, Double price, Integer sort)
    {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }
    
    public String getName() 
    {
     return name;
    }
 
    public Integer getSort() 
    {
      return sort;
    }
    
    public Double getPrice() 
    {
      return price;
    }
}


public class Main
{
	public static void main(String[] args) {
		Proviant eggs1 = new Proviant("Яйца 1 категории. Высший", 80.0, 1);
        Proviant eggs2 = new Proviant("Яйца 2 категории", 62.00, 2);
        Proviant eggs3 = new Proviant("Яйца 3 категории", 30.00, 3);
        Proviant lobster = new Proviant("Лобстер", 1500.00, 1);
        Proviant salt = new Proviant("Соль - Высший", 63.0, 2);
        Proviant bread = new Proviant("Высший хлеб", 200.0, 3);
        
        List<Proviant> itemsList = new ArrayList<>();
        itemsList.add(eggs1);
        itemsList.add(eggs2);
        itemsList.add(eggs3);
        itemsList.add(lobster);
        itemsList.add(salt);
        itemsList.add(bread);
        
        
        String searchName = "высший";
        Double maxPrice = 0.0;
        String maxPriceSortedNames = "";

        for (Proviant items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                if (maxPrice < items.getPrice()) {
                    maxPrice = items.getPrice();
                }
            }
        }

        for (Proviant items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                if (Objects.equals(items.getPrice(), maxPrice)) {

                    maxPriceSortedNames += items.getName() + "\n";
                }
            }
        }
        System.out.println("Самые дорогие товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Наибольшая цена: " + maxPrice);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
