package Fazenda_Iesm;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Caprino extends Animal {

	public Caprino(int id_animal,double preco_unitario, Date data_nas, String genero, Date data_vacina,
			float peso, boolean vacina) {
		super(id_animal,preco_unitario, data_nas, genero, data_vacina, peso, vacina);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void abate(ArrayList<Animal> animais, boolean vacina, float peso) {
		// TODO Auto-generated method stub
		super.abate(animais, vacina, peso);
		if(vacina == true && peso > 30) {
			System.out.println("Animal pronto para o abate");
		}
	}

	@Override
	public void vender(ArrayList<Animal> animais, boolean vacina) {
		// TODO Auto-generated method stub
		super.vender(animais, vacina);
	}

	@Override
	public void formataData(Date data_nas){

        Date setdata_nas = new Date();
        SimpleDateFormat formataDatas = new SimpleDateFormat("dd/mm/yyyy");
        String dataFormatada = formataDatas.format(setdata_nas);
        System.out.println(dataFormatada);

    }

}
