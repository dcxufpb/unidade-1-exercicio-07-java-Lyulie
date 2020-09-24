package com.example.project;

public class CupomFiscal {

	public static String dadosLojaParam(String nomeLoja, String logradouro, int numero, String complemento,
			String bairro, String municipio, String estado, String cep, String telefone, String observacao, String cnpj,
			String inscricaoEstadual) throws NullPointerException {

				if(nomeLoja == null)
					throw new RuntimeException("O campo nome da loja é obrigatório");
				if(nomeLoja.isEmpty())
					throw new RuntimeException("O campo nome da loja é obrigatório");
		
				if(logradouro == null)
					throw new RuntimeException("O campo logradouro do endereço é obrigatório");
				else if(logradouro.isEmpty())
					throw new RuntimeException("O campo logradouro do endereço é obrigatório");
				
				if(municipio == null)
					throw new RuntimeException("O campo município do endereço é obrigatório");
				else if(municipio.isEmpty())
					throw new RuntimeException("O campo município do endereço é obrigatório");

				if(estado == null)
					throw new RuntimeException("O campo estado do endereço é obrigatório");
				else if(estado.isEmpty())
					throw new RuntimeException("O campo estado do endereço é obrigatório");

				if(cnpj == null)
					throw new RuntimeException("O campo CNPJ da loja é obrigatório");
				else if(cnpj.isEmpty())
					throw new RuntimeException("O campo CNPJ da loja é obrigatório");
				
				if(inscricaoEstadual == null)
					throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
				else if(inscricaoEstadual.isEmpty())
					throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
				
				complemento = complemento == null? "" : complemento;
				bairro = bairro == null? "" : bairro;
				cep = cep == null? "" : cep;
				telefone = telefone == null? "" : telefone;
				observacao = observacao == null? "" : observacao;

				String _logradouro = logradouro + ", ";
				
				String _numero = (numero <= 0)? "s/n" : String.format("%d", numero);
				
				String _complemento = complemento.isEmpty()? "" : " " + complemento;
				
				String _bairro = bairro.isEmpty()? "" : bairro + " - ";
				
				String _municipio = municipio + " - ";
				
				String _cep = cep.isEmpty()? "" : "CEP:" + cep;

				String _telefone = telefone.isEmpty()? "" : "Tel " + telefone;
				_telefone = (!_telefone.isEmpty() && !_cep.isEmpty())? " " + _telefone : _telefone;
				
				String _observacao = observacao.isEmpty()? "" : observacao;
								
				String _cnpj = "CNPJ: " + cnpj;
				
				String _inscricao_estadual = "IE: " + inscricaoEstadual;
		
				String output = nomeLoja + "\n";
				output += _logradouro + _numero + _complemento  + "\n";
				output += _bairro + _municipio + estado + "\n";
				output +=  _cep + _telefone + "\n";
				output +=  _observacao + "\n";
				output +=  _cnpj + "\n";
				output +=  _inscricao_estadual + "\n";
		
				return output.replace("\n", System.lineSeparator());
	}

	public static void main(String[] args) {
		String k = null;
		System.out.println(k == null);
	}
}
