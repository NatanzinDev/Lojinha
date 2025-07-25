package jobs;

import models.Produto;
import models.Status;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job{
	 @Override
	public void doJob() throws Exception {
		if(Produto.count() == 0) {
			Produto p1 = new Produto("Brincos","Brincos dourados brilhantes",50.0,Status.ATIVO,"/public/images/joia2.jpg");
			Produto p2 = new Produto("Colar","Colar prata 50mm",80.0,Status.ATIVO, "/public/images/joia3.jpg");
			Produto p3 = new Produto("Pulseira","Pulseira dourada brilhante",75.0,Status.ATIVO, "/public/images/joia1.jpg");
			p1.save();
			p2.save();
			p3.save();
			
			
		}
	}
}
