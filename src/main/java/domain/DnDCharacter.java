package domain;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dnd")
public class DnDCharacter {

	@Id
	private String id;
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date lastModifiedDate;
	private String name;
	private String className;
	private String race;
	private String playerName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "D&DCharacter:{"
				+ "id:'" + id + '\''
				+ "createdDate" + createdDate + '\''
				+ "lastModifiedDate:'" + lastModifiedDate + '\''
				+ "name:'" + name + '\''
				+ "className:'" + className + '\''
				+ "race:'" + race + '\''
				+ "playerName:'" + playerName + '\''
				+ "}";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o.getClass() != DnDCharacter.class)
			return false;
		DnDCharacter other = (DnDCharacter) o;
		return Objects.equals(other.id, id) &&
				Objects.equals(other.createdDate, createdDate) &&
				Objects.equals(other.lastModifiedDate, lastModifiedDate) &&
				Objects.equals(other.name, name) &&
				Objects.equals(other.className, className) &&
				Objects.equals(other.race, race) &&
				Objects.equals(other.playerName, playerName);
	}
}
