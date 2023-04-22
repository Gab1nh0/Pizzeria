import java.util.Scanner;
public class Caja {
	String nombres[] = new String [50];
	String Pizza[][] = new String [50][6];
	Double ventas[][]  = new Double[50][6]; 
	int contFac=0;
    
	public void facturar() {
		int opcPostre=0, opcTiPostre=0, opcAgua=0, opcTamano=0, opcInAdicional=0, opcAdicional=0, opcIngrediente=0, opcRefresco=0, opcTamaRefresco=0;
		Double canSoda=0.00, canPostre=0.00, canAgua=0.00;
		Caja cj = new Caja();
		Scanner entrada = new Scanner (System.in);
		System.out.printf("--------------------Este es el pedido #"+ (contFac+1)+ " del dia--------------------\n");
		//------------------Nombre del cliente
		System.out.printf("Ingrese el nombre del cliente\n");
		nombres[contFac]=entrada.nextLine();
	
	
		//--------------Ingrediente
		
		System.out.printf("Ingrese el ingrediente de la pizza\n"
							+ "1-> Pepperoni \n"
							+ "2-> Jamon \n"
							+ "3-> Pollo \n"
							+ "4-> Vegetariana\n");
		opcIngrediente=entrada.nextInt();
			if(opcIngrediente==1) {
				Pizza[contFac][0]="Pepperoni";
			} else if(opcIngrediente==2) {
				Pizza[contFac][0]="Jamon";
			} else if(opcIngrediente==3){
				Pizza[contFac][0]="Pollo";
			} else if (opcIngrediente==4) {
				Pizza[contFac][0]="Vegetales";
			}
		
		
		//---------------Tamano
		
		System.out.printf("Ingrese el Tamano de la pizza\n"
				+ "1-> Personal \n"
				+ "2-> Familiar\n");
		opcTamano=entrada.nextInt();
			if(opcTamano==1) {
				Pizza[contFac][1]="Personal";
				ventas[contFac][0]=5.50;
			}else if(opcTamano==2) {
				Pizza[contFac][1]="Familiar";
				ventas[contFac][0]=12.00;
			}
			
			//-------------------------Ingrdiente Adicional
			
			System.out.printf("Ingrediente Adicional\n"
					+ "1-> Si \n"
					+ "2-> No\n");
			opcInAdicional=entrada.nextInt();
			
			if(opcInAdicional==1) {
				ventas[contFac][1]=1.00;
				System.out.printf("Ingrese el ingrediente de la pizza\n"
						+ "1-> Pepperoni \n"
						+ "2-> Jamon \n"
						+ "3-> Pollo \n"
						+ "4-> Hongos\n");
				opcIngrediente=entrada.nextInt();
				if(opcIngrediente==1) {
					Pizza[contFac][2]="Pepperoni";
				} else if(opcIngrediente==2) {
					Pizza[contFac][2]="Jamon";
				} else if(opcIngrediente==3){
					Pizza[contFac][2]="Pollo";
				} else if (opcIngrediente==4) {
					Pizza[contFac][2]="Hongos";
				}
				
				} else if(opcInAdicional==2) {
				Pizza[contFac][2]="Sin Ingrediente Adicional";
				ventas[contFac][1]=0.00;
			}
			
		//--------------Refresco
			
		System.out.printf("Ingrese el refresco\n"
				+ "1-> Soda \n"
				+ "2-> Te frio\n");
		opcRefresco=entrada.nextInt();
			if(opcRefresco==1) {
				System.out.printf("Ingrese la cantidad de sodas\n");
				canSoda=entrada.nextDouble();
				int i_cansoda = canSoda.intValue();
				Pizza[contFac][3]="x"+i_cansoda+" Soda";
				System.out.printf("Ingrese el tamano del refresco\n"
						+ "1-> Regular \n"
						+ "2-> Grande\n");
				opcTamaRefresco=entrada.nextInt();
					if(opcTamaRefresco==1) {
						ventas[contFac][2]=1.50*canSoda;
					} else if(opcTamaRefresco==2) {
						ventas[contFac][2]=2.25*canSoda;
					}
			} else if(opcRefresco==2) {
				System.out.printf("Ingrese la cantidad de te frio\n");
				canSoda=entrada.nextDouble();
				int i_cansoda = canSoda.intValue();
				Pizza[contFac][3]="x"+i_cansoda+" Te frio";
				System.out.printf("Ingrese el tamano del refresco\n"
						+ "1-> Regular \n"
						+ "2-> Grande\n");
				opcTamaRefresco=entrada.nextInt();
					if(opcTamaRefresco==1) {
						ventas[contFac][2]=1.50*canSoda;
					} else if(opcTamaRefresco==2) {
						ventas[contFac][2]=2.25*canSoda;
					}
			}
		
		//--------------Postre
		
		System.out.printf("¿Desea llevar un postre?\n"
				+ "1-> Si \n"
				+ "2-> No\n");
		opcPostre=entrada.nextInt();
		if (opcPostre==1) {
			System.out.printf("Ingrese la cantidad de postres\n");
			canPostre=entrada.nextDouble();
			int i_canpsotre = canPostre.intValue();
			System.out.printf("Ingrese el postre\n"
					+ "1-> flan \n"
					+ "3-> cheesecake \n"
					+ "3-> tiramisu\n");
			opcTiPostre=entrada.nextInt();
			ventas[contFac][3]=3.50*canPostre;
			if(opcIngrediente==1) {
				Pizza[contFac][4]="x"+i_canpsotre+" flan";
			} else if(opcIngrediente==2) {
				Pizza[contFac][4]="x"+i_canpsotre+" cheesecake";
			} else if(opcIngrediente==3){
				Pizza[contFac][4]="x"+i_canpsotre+" tiramisu";
			} 
		}else if (opcPostre==2) {
			Pizza[contFac][4]="Sin Postre";
			ventas[contFac][3]=0.00;
		}
		//--------------Botella de agua
		
		System.out.printf("¿Desea llevar botella de agua?\n"
				+ "1-> Si \n"
				+ "2-> No\n");
		opcAgua=entrada.nextInt();
		if (opcAgua==1) {
			System.out.printf("Ingrese la cantidad de botellas de agua\n");
			canAgua=entrada.nextDouble();
			int i_canagua = canAgua.intValue();
			ventas[contFac][4] = 1.50*canAgua;
			Pizza[contFac][5]=" x"+ i_canagua +" Botella de Agua";
		}else if (opcAgua==2){
			Pizza[contFac][5]="Sin botella de agua";
			ventas[contFac][4] = 0.00;
		}
		//--------------------------Imprimir
		ventas[contFac][5]=ventas[contFac][0]+ventas[contFac][1]+ventas[contFac][2]+ventas[contFac][3]+ventas[contFac][4];
		System.out.printf("--------------------SUPER PIZZA --------------------\n");
		System.out.printf("--------------------Factura #"+ (contFac+1)+ " --------------------\n");
		System.out.printf("Cliente #"+ (contFac+1)+ ": "+nombres[contFac]+"\n");
		System.out.printf("Ingrediente principal: "+Pizza[contFac][0]+"\n");
		System.out.printf("Tamano: "+Pizza[contFac][1] +"....................................$"+ventas[contFac][0]+"\n");
		System.out.printf("Ingrediente adicional: "+Pizza[contFac][2] +".....................$"+ventas[contFac][1]+"\n");
		System.out.printf("Refresco: "+Pizza[contFac][3] +"..................................$"+ventas[contFac][2]+"\n");
		System.out.printf("Postre: "+Pizza[contFac][4] +"....................................$"+ventas[contFac][3]+"\n");
		System.out.printf("Agua: "+Pizza[contFac][5] +"......................................$"+ventas[contFac][4]+"\n");
		System.out.printf("Total:............................................................$"+ventas[contFac][5]+"\n");
		contFac=contFac+1;
	}
	
	public void combo(){
		int opcIngrediente=0, opcRefresco=0, opcTamaRefresco=0, opcAgrandar;
		Double canSoda=0.00, canPostre=0.00, canAgua=0.00;
		String nombre = null;
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.printf("--------------------Este es el pedido #"+ (contFac+1)+ " del dia--------------------\n");
		//------------------Nombre del cliente
		System.out.printf("Ingrese el nombre del cliente\n");
		nombres[contFac]=entrada.nextLine();
		nombre=nombres[contFac];
		
		//--------------Ingrediente
		
		System.out.printf("Ingrese el ingrediente de la pizza\n"
							+ "1-> Pepperoni \n"
							+ "2-> Jamon \n"
							+ "3-> Pollo \n"
							+ "4-> Vegetariana\n");
		opcIngrediente=entrada.nextInt();
			if(opcIngrediente==1) {
				Pizza[contFac][0]="Pepperoni";
			} else if(opcIngrediente==2) {
				Pizza[contFac][0]="Jamon";
			} else if(opcIngrediente==3){
				Pizza[contFac][0]="Pollo";
			} else if (opcIngrediente==4) {
				Pizza[contFac][0]="Vegetales";
			}
			
			//---------------Tamano
			Pizza[contFac][1]="Personal";
			ventas[contFac][0]=5.50;
			
			//------------Ingredientes adicionales
			Pizza[contFac][2]="Sin Ingrediente Adicional";
			ventas[contFac][1]=0.00;
			
			//--------------Refresco
			System.out.printf("Ingrese el refresco\n"
					+ "1-> Soda \n"
					+ "2-> Te frio\n");
			opcRefresco=entrada.nextInt();
			if(opcRefresco==1) {
			Pizza[contFac][3]="x1 Soda";
			} else if(opcRefresco==2) {
				Pizza[contFac][3]="x1 Te frio";	
			}
			System.out.printf("¿Agrandar el refresco?\n"
					+ "1-> Si \n"
					+ "2-> No\n");
			opcAgrandar=entrada.nextInt();
			if(opcAgrandar==1) {
				ventas[contFac][2]=2.25;
			} else if(opcAgrandar==2) {
				ventas[contFac][2]=1.25;
			}
			
			//---------------Sin Postres
			Pizza[contFac][4]="Sin Postre";
			ventas[contFac][3]=0.00;
			
			//-----------------Sin Agua
			Pizza[contFac][5]="Sin botella de agua";
			ventas[contFac][4] = 0.00;
			
		//--------------------------Imprimir
		nombres[contFac]=entrada.nextLine();
		ventas[contFac][5]=ventas[contFac][0]+ventas[contFac][1]+ventas[contFac][2]+ventas[contFac][3]+ventas[contFac][4];
		System.out.printf("--------------------SUPER PIZZA --------------------\n");
		System.out.printf("--------------------Factura #"+ (contFac+1)+ " --------------------\n");
		System.out.printf("Cliente #"+ (contFac+1)+ ": "+nombre+"\n");
		System.out.printf("Ingrediente principal: "+Pizza[contFac][0]+"\n");
		System.out.printf("Tamano: "+Pizza[contFac][1] +"....................................$"+ventas[contFac][0]+"\n");
		System.out.printf("Ingrediente adicional: "+Pizza[contFac][2] +".....................$"+ventas[contFac][1]+"\n");
		System.out.printf("Refresco: "+Pizza[contFac][3] +"..................................$"+ventas[contFac][2]+"\n");
		System.out.printf("Postre: "+Pizza[contFac][4] +"....................................$"+ventas[contFac][3]+"\n");
		System.out.printf("Agua: "+Pizza[contFac][5] +"......................................$"+ventas[contFac][4]+"\n");
		System.out.printf("Total:............................................................$"+ventas[contFac][5]+"\n");
		contFac=contFac+1;
	}

    public void porcentaje() {
    	int pos=0;
    	Double totalPizza=0.00, totalRefresco=0.00, totalPostres=0.00, totalAgua=0.00, totalDia=0.00;
    	Double porPizza=0.00, porRefresco=0.00, porPostres=0.00, porAgua=0.00;
    for (int i = 0; i < contFac; i++) {
    	pos=i;
    	totalPizza=ventas[pos][0]+totalPizza+ventas[pos][1];
    	totalRefresco=ventas[pos][2]+totalRefresco;
    	totalPostres=ventas[pos][3]+totalPostres;
    	totalAgua=ventas[pos][4]+totalAgua;
    	totalDia=totalAgua+totalPostres+totalRefresco+totalPizza;
    }
    
    //Porcentajes
   porPizza=totalPizza/totalDia*100;
   double roundporPizza = Math.round(porPizza*100.0)/100.0; 
   porRefresco=totalRefresco/totalDia*100;
   double roundporRefresco = Math.round(porRefresco*100.0)/100.0;
   porPostres=totalPostres/totalDia*100;
   double roundporPostres = Math.round(porPostres*100.0)/100.0;
   porAgua=totalAgua/totalDia*100;
   double roundporAgua = Math.round(porAgua*100.0)/100.0;
    	System.out.printf("El total recaudado en ventas de pizza es: ....................................$"+totalPizza+"\n");
    	System.out.printf("El total recaudado en ventas de pizza es (Mostrado en Porcentaje): ................"+roundporPizza+"%%\n");
    	System.out.printf("El total recaudado en ventas de refrescos es: ....................................$"+totalRefresco+"\n");
    	System.out.printf("El total recaudado en ventas de refrescos es (Mostrado en Porcentaje): ............."+roundporRefresco+"%%\n");
    	System.out.printf("El total recaudado en ventas de postres es: ....................................$"+totalPostres+"\n");
    	System.out.printf("El total recaudado en ventas de postres es (Mostrado en Porcentaje): ......................."+roundporPostres+"%%\n");
    	System.out.printf("El total recaudado en ventas de botellas de agua es: ....................................$"+totalAgua+"\n");
    	System.out.printf("El total recaudado en ventas de botellas de agua es (Mostrado en Porcentaje): ......................"+roundporAgua+"%%\n");
    	System.out.printf("El total recaudado en ventas en general es: ....................................$"+totalDia+"\n");
    }
        
    public static void main(String [] ar){
    	Caja cj = new Caja();
    	Scanner entrada = new Scanner (System.in);
    	int opcion = 0;
    			do {
    				System.out.printf("--------------------SUPER PIZZA --------------------\n"
    						 + "1. 	Combo Personalizado\n"
    						 + "2. 	Combo Regular\n"
    						 + "3. 	Ver porcentajes de las ganancias en el dia\n"
    						 + "4.  Salir\n\n");
    	                        opcion=entrada.nextInt();
    						
    				switch (opcion) {
    				case 1:
    					cj.facturar();

    					break;
    				case 2:
    					cj.combo();
    					break;
    				case 3:
    					cj.porcentaje();
    					break;
    				case 4:
    					System.exit(0);
    					break;                              
    				default:
    					break;
    				}
    			} while (opcion !=4);

    	}  
 
}