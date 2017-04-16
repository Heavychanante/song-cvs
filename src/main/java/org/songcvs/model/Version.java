package org.songcvs.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "versions")
@JsonInclude(Include.NON_EMPTY)
public class Version {

	// ATRIBUTOS //

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "creation")
	private Timestamp creation;

	@ManyToOne
	@JoinColumn(name = "song_id")
	private Song song;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	private File tabFile;

	@ManyToOne
	private File audioFile;

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

	public Timestamp getCreation() {
		return creation;
	}

	public void setCreation(Timestamp creation) {
		this.creation = creation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public File getTabFile() {
		return tabFile;
	}

	public void setTabFile(File tabFile) {
		this.tabFile = tabFile;
	}

	public File getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(File audioFile) {
		this.audioFile = audioFile;
	}
}
