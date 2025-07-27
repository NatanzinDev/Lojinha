package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Compra extends Model {
	public Date data;
	public Double valortotal;
}
