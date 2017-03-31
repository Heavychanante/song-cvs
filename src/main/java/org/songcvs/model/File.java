package org.songcvs.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad que representa la tabla Files de la base de datos
 * @author Hugo
 *
 */
@Entity
@Table(name = "files")
public class File {

	// ATRIBUTOS //

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", nullable = false, length = 255)
	private String name;

	@Column(name = "type", nullable = false)
	private Integer type;

	@Column(name = "mime", nullable = true, length = 50)
	private String mime;

	@Column(name = "hash", nullable = true, length = 32)
	private String hash;

	@Column(name = "content")
	private byte[] content;

	@Column(name = "creation")
	private Timestamp creation;


	// CONSTRUCTORES //

	public File() {
		super();
	}


	// MÉTODOS //

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	public String getMime() {
		return mime;
	}


	public void setMime(String mime) {
		this.mime = mime;
	}


	public String getHash() {
		return hash;
	}


	public void setHash(String hash) {
		this.hash = hash;
	}


	public byte[] getContent() {
		return content;
	}


	public void setContent(byte[] content) {
		this.content = content;
	}


	public Timestamp getCreation() {
		return creation;
	}


	public void setCreation(Timestamp creation) {
		this.creation = creation;
	}

}