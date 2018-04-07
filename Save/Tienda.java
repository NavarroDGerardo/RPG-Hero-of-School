public class Tienda{
	
	private ItemDefensa[] itemsDefensa;
	private ItemArma[] itemsArma;
	private ItemEspecialNormal[] itemsEspecialesNormal;
	private ItemEspecialAplicado[] itemsEspecialesAplicado;
	private ItemEspecialCheater[] itemsEspecialesCheater;

	public Tienda(){
		itemsDefensa=new ItemDefensa[4];
		itemsAtmas=new ItemArma[4];
		itemsEspecialesNormal=new ItemEspecialNormal[2];
		itemsEspecialesAplicado= new ItemEspecialAplicado[2];
		itemsEspecialesCheater= new ItemEspecialCheater[2];
	}

	public ItemDefensa[] getItemsDefensa(){
		return itemsDefensa;
	}

	public void addItemDefensa(ItemDefensa cuaderno,int index){
		itemsDefensa[index]=cuaderno;
	}

	public void addItemDefensa(ItemDefensa carpeta,int index){
		itemsDefensa[index]=carpeta;
	}

	public void addItemDefensa(ItemDefensa lonchera,int index){
		itemsDefensa[index]=lonchera;
	}

	public void addItemDefensa(ItemDefensa mochila,int index){
		itemsDefensa[index]=mochila;
	}


	public ItemArma[] getItemsArmas(){
		return itemsArma;
	}

	public void additemArma(ItemArma d, int index){
		itemsArma[index] = d;
	}

	public void addItemDefensa(ItemDefensa cuaderno,int index){
		itemsDefensa[index]=cuaderno;
	}

	public void addItemDefensa(ItemDefensa carpeta,int index){
		itemsDefensa[index]=carpeta;
	}

	public void addItemDefensa(ItemDefensa lonchera,int index){
		itemsDefensa[index]=lonchera;
	}

	public void addItemDefensa(ItemDefensa mochila,int index){
		itemsDefensa[index]=mochila;
	}

	public ItemEspecialNormal[] getItemsEspecialesNormal(){
		return itemsEspecialesNormal;
	}

	public void addItemEspecialNormal(ItemEspecialNormal veladora,int index){
		itemsEspecialesNormal[index]=veladora;
	}

	public void addItemEspecialNormal(ItemEspecialNormal estudiarAmigo,int index){
		itemsEspecialesNormal[index]=estudiarAmigo;
	}

	public ItemEspecialAplicado[] getItemsEspecialesAplicado(){
		return itemsEspecialesAplicado;
	}

	public void addItemEspecialAplicado(ItemEspecialAplicado cafe,int index){
		itemsEspecialesAplicado[index]=cafe;
	}

	public void addItemEspecialAplicado(ItemEspecialAplicado trabajosExtra,int index){
		itemsEspecialesAplicado[index]=trabajosExtra;
	}

	public ItemEspecialCheater[] getItemsEspecialesCheater(){
		return itemsEspecialesCheater;
	}

	public void addItemEspecialCheater(ItemEspecialCheater trabajoComprado,int index){
		itemsEspecialesCheater[index]=trabajoComprado;
	}

	public void addItemEspecialCheater(ItemEspecialCheater acordeon,int index){
		itemsEspecialesCheater[index]=acordeon;
	}


}