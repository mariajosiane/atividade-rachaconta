import java.util.Scanner

fun racharConta(conta: Float, amigos: Float):Float{
	return conta/amigos
}

fun main(){

	val reader = Scanner(System.`in`)
	print("Digite o valor da conta:\t")
	
	var conta:Float = reader.nextFloat()
	
	print("Digite a quantidade de amigos:\t")
	var amigos:Float = reader.nextFloat()
	
	println("Valor para cada pessoa:\t" + racharConta(conta,amigos))
}