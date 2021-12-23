package powerConsumption;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Home {
		
		public static int getTotalPower(Appliances a1, Appliances a2, Appliances a3) {
			
			return a1.totalPowerConsumed()+a2.totalPowerConsumed()+a3.totalPowerConsumed();
		}
		
		public static void sortDevices(Appliances a1, Appliances a2, Appliances a3) {
			
			TreeMap<Integer,Appliances> map = new TreeMap<Integer,Appliances>();
			
			map.put(a3.totalPowerConsumed(), a3);
			map.put(a2.totalPowerConsumed(), a2);
			map.put(a1.totalPowerConsumed(),a1);
			System.out.println("Devices sorted by powerConsumption consumption: ");
			for(Entry<Integer,Appliances> e : map.entrySet()) {
				System.out.println(e.getValue().getClass().getSimpleName()+":"+e.getKey());
				}
		}

		public static void main(String[] args) {
			
			Appliances f = new Fan(1,5);
			Appliances t = new TV(3,1);
			Appliances l = new Light(2,10);
			
			System.out.println("Total Power consumed is: "+getTotalPower(f, t, l)+" units");
			sortDevices(f, t, l);
		}
	}
