package com.julio.strategy;

public enum TipoOperacao {
	SOMA {
		@Override
		public OperacaoMatematica realizaroperacao() {
			return new Soma();
		}
		
	},
	SUBTRACAO {
		@Override
		public OperacaoMatematica realizaroperacao() {
			return new Subtracao();
		}
	},
	MULTIPLICACAO {
		@Override
		public OperacaoMatematica realizaroperacao() {
			return new Multiplicacao();
		}
	},
	DIVISAO {
		@Override
		public OperacaoMatematica realizaroperacao() {
			return new Divisao();
		}
	};
	
	public abstract OperacaoMatematica realizaroperacao();
}
