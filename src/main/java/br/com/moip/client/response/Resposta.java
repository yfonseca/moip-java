package br.com.moip.client.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Resposta {

	@XStreamAlias("ID")
	private String id;

	@XStreamAlias("Status")
	private String status;

	@XStreamAlias("Token")
	private String token;

	public String getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public String getToken() {
		return token;
	}

	@Override
	public String toString() {
		return "Resposta [id=" + id + ", status=" + status + ", token=" + token
				+ "]";
	}

}