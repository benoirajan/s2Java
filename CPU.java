//21-5-22
public class CPU{
    float price;
    
	public static void main(String[] ar){
        CPU c = new CPU(10000,"Intel",8,"Acer",8);
	}
	
	CPU(float pr,String pm, int c, String mm, float gb){
        price = pr;
        Processer p = new Processer();
        p.manufacturer = pm;
        p.cores = c;
        RAM.manufacturer = mm;
        RAM.gb = gb;
        System.out.printf("Processor: %s, cores: %d\nRAM: %s, size: %fGB\nTotal: %fRs\n",p.manufacturer,p.cores,RAM.manufacturer,RAM.gb,price);
	}
	
	class Processer{
        String manufacturer;
        int cores;
	}
	
	static class RAM{
        static float gb;
        static String manufacturer;
	}
}

// Processor: Intel, cores: 8
// RAM: Acer, size: 8.000000
// Total: 10000.000000Rs
