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
    private String cname;
    private Double price;
    private Double weight;
    private String sort;

    public Proviant(String name, String cname, Double weight, Double price, String sort)
    {
        this.name = name;
        this.cname = cname;
        this.price = price;
        this.sort = sort;
        this.weight = weight;
    }
    
    public String getName() 
    {
     return name;
    }
 
    public String getSort() 
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
		Proviant eggs1 = new Proviant("Яйца 1 категории. Высший","Russia", 2.0,80.0, "High");
        Proviant eggs2 = new Proviant("Яйца 2 категории.","Belarus", 2.0,70.0, "High");
        Proviant eggs3 = new Proviant("Lobster","Latvia",10.0, 3000.00,"Middle");
        Proviant lobster = new Proviant("Lobster","Latvia",12.0, 2000.00,"Middle");
        
        List<Proviant> itemsList = new ArrayList<>();
        
        itemsList.add(eggs1);
        itemsList.add(eggs2);
        itemsList.add(eggs3);
        itemsList.add(lobster);
       
        
        
        String search = "High";
        
        
        double minPrice = itemsList.get(0).getPrice();
        for (Proviant items : itemsList) {

            if (items.getSort().equals(search)) {
                if (items.getPrice() < minPrice) {
                    minPrice = items.getPrice();
                }
            }
        }
        StringBuilder Result = new StringBuilder();
        for (Proviant items : itemsList) {

            if (items.getSort().equals(search) && (items.getPrice() == minPrice)) {
                Result.append(items.getName()).append("\n");
            }
        }
        System.out.println("Самые бюджетные товары сорта " + search + ": \n" + Result);

        
        
	}
}
