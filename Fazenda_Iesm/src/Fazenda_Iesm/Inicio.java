package Fazenda_Iesm;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Inicio
{

	private static Scanner ler;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ArrayList<Fazenda> fazenda = new ArrayList<>();
        ArrayList<Animal> animais = new ArrayList<>();
		ler = new Scanner(System.in);
		int op = 0;
        int es;
        while (true)
        {
               System.out.println("1 - Registrar Fazendas ");
               System.out.println("2 - Registrar Animais ");
               System.out.println("3 - Listar Fazendas registradas ");
               System.out.println("4 - Listar Animais registrados ");
               System.out.println("5 - Listar Animais Vacinados ");
               System.out.println("6 - Listar Animais Aptos para venda ");
               System.out.println("7 - Listar Animais Aptos para Abate ");
               System.out.println("8 - Adicionar Animais a fazenda");
               System.out.println("9 - Comprar Animais para a fazenda");
               System.out.println("10 - Vender Animais da fazenda");
               System.out.println("Escolhar a opção: ");
               op = ler.nextInt();
               switch(op)
               {
               	case 1:
               	{
               	              System.out.println("Nome da fazenda: ");
                                     String nome = ler.next();
                                     System.out.println("ID da fazenda: ");
                                     int id_fazenda = ler.nextInt();
                                     Fazenda f = new Fazenda(nome,id_fazenda, animais, fazenda);
                                     fazenda.add(f);
                                     System.out.println("Deseja registrar mais fazendas? s/n");
                                     String res = ler.next();
                                     if(res == "s")
                                     {
                                    	 continue;
                                     }
                                     else if(res == "n")
                                     {
                                    	 break;
                                     }
                                     
                                     
               	}
               	case 2:
            	{
            		
            		  System.out.println("1 - Bovinos ");
            		  System.out.println("2 - Caprinos  ");
            		  System.out.println("3 - Suinos  ");
            		  System.out.println("Escolha uma opÃ§Ã£o");
            		  es = ler.nextInt();
            		  if(es == 1)
            		  {  
            			  System.out.println(" Registro dos Bovinos ");
                                      System.out.println("ID do bovino: ");
                                      int id_animal = ler.nextInt();
                                      System.out.println("Preço unitário: ");
                                      double preco_unitario = ler.nextDouble();
                                      System.out.println("Data de nascimento: ");
                                      String data =  ler.next();
                                      Date data_nas = new Date(data);
                                      System.out.println("Genero: ");
                                      String genero = ler.next();
                                      System.out.println("Data da vacina: ");
                                      String data2 =  ler.next();
                                      Date data_vacina = new Date(data2);
                                      System.out.println("Peso: ");
                                      float peso = ler.nextFloat();
                                      System.out.println("Vacinado:(true/false) ");
                                      boolean vacina = ler.nextBoolean();
                                      Animal b = new Bovino(id_animal, preco_unitario, data_nas, genero, data_vacina, peso, vacina);
                                      animais.add(b);
                                      System.out.println("Deseja registrar mais bovinos? s/n");
                                      String res = ler.next();
                                      if(res == "s")
                                      {
                                     	 continue;
                                      }
                                      else if(res == "n")
                                      {
                                     	 break;
                                      }
                                      
                                
            			  
            		  } 
            		  else if(es == 2)
            		  {
                                  
            			  			  System.out.println(" Registro dos Caprinos ");
            			              System.out.println("ID do caprino: ");
                                      int id_animal = ler.nextInt();
                                      System.out.println("Preço unitário: ");
                                      double preco_unitario = ler.nextDouble();
                                      System.out.println("Data de nascimento: ");
                                      String data = ler.next();
                                      Date data_nas = new Date(data);
                                      System.out.println("Genero: ");
                                      String genero = ler.next();
                                      System.out.println("Data da vacina: ");
                                      String datavacina = ler.next();
                                      Date data_vacina = new Date(datavacina);
                                      System.out.println("Peso: ");
                                      float peso = ler.nextFloat();
                                      System.out.println("Vacinado:(true/false) ");
                                      boolean vacina = ler.nextBoolean();
                                      Animal c = new Caprino(id_animal, preco_unitario, data_nas, genero, data_vacina, peso, vacina);
                                      animais.add(c);
                                      System.out.println("Deseja registrar mais caprinos? s/n");
                                      String res = ler.next();
                                      if(res == "s")
                                      {
                                     	 continue;
                                      }
                                      else if(res == "n")
                                      {
                                     	 break;
                                      }
                                      
            			  
            		  }
            		  else if (es == 3)
            		  {
            			  			  System.out.println(" Registro dos Suinos ");
            			  			  System.out.println("ID do Suino: ");
                                      int id_animal = ler.nextInt();
                                      System.out.println("Preço unitário: ");
                                      double preco_unitario = ler.nextDouble();
                                      System.out.println("Data de nascimento: ");
                                      String data = "21/11/2011";
                                      Date data_nas = new Date(data);
                                      System.out.println("Genero: ");
                                      String genero = ler.next();
                                      System.out.println("Data da vacina: ");
                                      String data2 = "29/07/2012";
                                      Date data_vacina = new Date(data2);
                                      System.out.println("Peso: ");
                                      float peso = ler.nextFloat();
                                      System.out.println("Vacinado: (true/false) ");
                                      boolean vacina = ler.nextBoolean();
                                      Animal s = new Suino(id_animal, preco_unitario, data_nas, genero, data_vacina, peso, vacina);
                                      animais.add(s);
                                      System.out.println("Deseja registrar mais suinos? s/n");
                                      String res = ler.next();
                                      if(res == "s")
                                      {
                                     	 continue;
                                      }
                                      else if(res == "n")
                                      {
                                     	 break;
                                      }
                                      
            			  
            		  }



       	}
               	case 3:
                {
                    mostrarFazendas(fazenda);
                    
                }
                case 4:
                {
                    mostrarAnimais(animais);
                }
                {
                    boolean vacina = false;
                    mostrarAnimaisVacinados(animais,vacina);
                }
                 case 6:
                {
                    boolean vacina = false;
                    mostrarAnimaisVenda(animais,vacina);
                }
                 case 7:
                 {
                     mostrarAnimaisAbate();
                 }
                 case 8:
                 {
                     adicionaAnimal(animais,fazenda);
                 }



       }
}
}
	static void mostrarFazendas(ArrayList<Fazenda> fazenda) {
        System.out.println("<><><><><><><><><><><><><><><><>");   
        for(int i = 0; i< fazenda.size();i++)
       {
           System.out.println(fazenda.get(i));
       }
       System.out.println("<><><><><><><><><><><><><><><><>");  
    }

    static void mostrarAnimais(ArrayList<Animal> animais) {
     System.out.println("===========================");   
      for(int i = 0; i< animais.size();i++)
     {
        System.out.println(animais.get(i));
     }
     System.out.println("===========================");
 }
    static void mostrarAnimaisVacinados(ArrayList<Animal> animais ,boolean vacina) {
        System.out.println("===========================");   
         for(int i = 0; i< animais.size();i++)
        {
            if(vacina == true)
            {
                System.out.println(animais.get(i));
            }
           
        }
        System.out.println("===========================");
    }
    static void mostrarAnimaisVenda(ArrayList<Animal> animais ,boolean vacina) {
        System.out.println("===========================");   
         for(int i = 0; i< animais.size();i++)
        {
            if(vacina == true)
            {
                System.out.println(animais.get(i));
            }
           
        }
        System.out.println("===========================");
    }
    public static void mostrarAnimaisAbate() { 
        ArrayList<Bovino> abatebovinomain = Bovino.abatebovino;
        ArrayList<Caprino> abatecaprinomain = Caprino.abatecaprino;
        ArrayList<Suino> abatesuinomain = Suino.abatesuino;
        System.out.println(abatebovinomain);
        System.out.println(abatecaprinomain);
        System.out.println(abatesuinomain);
     }

    static void adicionaAnimal(ArrayList<Animal> animais,ArrayList<Fazenda> fazenda)
    {
       
           
       
    }
    static void comprar(ArrayList<Animal> animais ,boolean vacina) {
        System.out.println("===========================");   
         for(int i = 0; i< animais.size();i++)
        {   System.out.println("Animais que podem ser comprados");
            if(vacina == true)
            {
                System.out.println(animais.get(i));
            }
           
        }

   }
}