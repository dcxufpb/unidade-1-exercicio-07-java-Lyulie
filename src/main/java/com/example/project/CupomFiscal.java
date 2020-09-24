package com.example.project;

public class CupomFiscal {

	public static boolean isNullEmpty(String text) {
		if(text == null)
			return true;
		else if (text.isEmpty())
			return true;
		return false;
	}

	public static String dadosLojaParam(String nomeLoja, String logradouro, int numero, String complemento,
			String bairro, String municipio, String estado, String cep, String telefone, String observacao, String cnpj,
			String inscricaoEstadual) throws NullPointerException {

				if(isNullEmpty(nomeLoja))
					throw new RuntimeException("O campo nome da loja é obrigatório");
		
				if(isNullEmpty(logradouro))
					throw new RuntimeException("O campo logradouro do endereço é obrigatório");
				
				if(isNullEmpty(municipio))
					throw new RuntimeException("O campo município do endereço é obrigatório");
				
				if(isNullEmpty(estado))
					throw new RuntimeException("O campo estado do endereço é obrigatório");
				
				if(isNullEmpty(cnpj))
					throw new RuntimeException("O campo CNPJ da loja é obrigatório");
			
				if(isNullEmpty(inscricaoEstadual))
					throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");

				String _logradouro = logradouro + ", ";
				
				String _numero = (numero <= 0)? "s/n" : String.format("%d", numero);
				
				String _complemento = isNullEmpty(complemento)? "" : " " + complemento;
				
				String _bairro = isNullEmpty(bairro)? "" : bairro + " - ";
				
				String _municipio = municipio + " - ";
				
				String _cep = isNullEmpty(cep)? "" : "CEP:" + cep;

				String _telefone = isNullEmpty(telefone)? "" : "Tel " + telefone;
				_telefone = (!_telefone.isEmpty() && !_cep.isEmpty())? " " + _telefone : _telefone;
				
				String _observacao = isNullEmpty(observacao)? "" : observacao;
								
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
}
