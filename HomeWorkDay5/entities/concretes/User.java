package entities.concretes;

public class User {
		private int id;
		private String firstName;
		private String lastName;
		private String parola;
		private String eposta;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getParola() {
			return parola;
		}
		public void setParola(String parola) {
			this.parola = parola;
		}
		public String getEposta() {
			return eposta;
		}
		public void setEposta(String eposta) {
			this.eposta = eposta;
		}
		public User() {
			
		}
		public User(int id, String firstName, String lastName, String parola, String eposta) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.parola = parola;
			this.eposta = eposta;
		}
}
