package jobs;

import models.Avaliacao;
import models.Produto;
import models.Status;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job {
	@Override
	public void doJob() throws Exception {
		if (Produto.count() == 0) {
			Produto p1 = new Produto("Brincos", "Brincos dourados brilhantes", 50.0, Status.ATIVO,
					"/public/images/joia2.jpg");
			Produto p2 = new Produto("Colar", "Colar prata 50mm", 80.0, Status.ATIVO, "/public/images/joia3.jpg");
			Produto p3 = new Produto("Pulseira", "Pulseira dourada brilhante", 75.0, Status.ATIVO,
					"/public/images/joia1.jpg");
			Produto p4 = new Produto("Colar", "Colar dourado com pingente 50mm", 50.0, Status.ATIVO,
					"/public/images/joia4.jpg");
			Produto p5 = new Produto("Pingente", "Pingente coração", 45.0, Status.ATIVO, "/public/images/joia5.jpg");
			Produto p6 = new Produto("Brincos", "brincos dourados e colar", 75.0, Status.ATIVO,
					"/public/images/joia6.jpg");
			Produto p7 = new Produto("Brincos", "Brincos dourados brilhantes", 65.0, Status.ATIVO,
					"/public/images/joia7.jpg");
			Produto p8 = new Produto("Colar", "Colar dourado 50mm", 100.0, Status.ATIVO, "/public/images/joia8.jpg");

			p1.save();
			p2.save();
			p3.save();
			p4.save();
			p5.save();
			p6.save();
			p7.save();
			p8.save();

			Avaliacao avaliacao1 = new Avaliacao(
					"Simplesmente apaixonada! As peças são de altíssima qualidade e ainda mais bonitas que nas fotos. A entrega foi super rápida e chegou tudo embaladinho com muito capricho. Recomendo de olhos fechados!",
					"Juliana Santos",p1);

			Avaliacao avaliacao2 = new Avaliacao(
					"Comprei o 'Conjunto Trevo' e fiquei impressionada com o brilho das pedras e com o acabamento, que é muito bem feito. Uma peça delicada e de presença. Adorei a compra.",
					"Fernanda Costa",p3);

			Avaliacao avaliacao3 = new Avaliacao(
					"Comprei a 'Pulseira Bracelete' de presente para minha esposa e ela amou! É uma peça elegante que combina com tudo. O processo de compra foi fácil e a entrega foi no prazo.",
					"Ricardo Alves",p5);

			Avaliacao avaliacao4 = new Avaliacao(
					"Já é minha terceira compra na loja e a qualidade me surpreende a cada pedido. Os brincos são leves e não incomodam na orelha. Já virei cliente fiel. Parabéns pelo trabalho!",
					"Bruna Lima",p8);

			avaliacao1.save();
			avaliacao2.save();
			avaliacao3.save();
			avaliacao4.save();

		}
	}
}
