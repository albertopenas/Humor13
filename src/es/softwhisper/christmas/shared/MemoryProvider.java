package es.softwhisper.christmas.shared;

import java.util.ArrayList;

import es.softwhisper.christmas.configuration.Constants;
import es.softwhisper.christmas.model.JokeModel;
import es.softwhisper.christmas.model.MediaModel;
import es.softwhisper.christmas.model.PostalModel;

import android.app.Application;

public class MemoryProvider extends Application{
	private ArrayList<MediaModel> medias =  null;
	private ArrayList<JokeModel> jokes = null;
	private ArrayList<PostalModel> postals = null;
	
	@Override
	public void onCreate() {
		super.onCreate();
		if (medias == null){
			medias = new ArrayList<MediaModel>();

			
			medias.add(new MediaModel("Feliz navidad con humor", "rtsp://v7.cache4.c.youtube.com/CjYLENy73wIaLQm78SIxib9joxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("El villancico del PP", "rtsp://v8.cache6.c.youtube.com/CjYLENy73wIaLQmV_ZWI3jneVhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("El villancico del PSOE", "rtsp://v6.cache7.c.youtube.com/CjYLENy73wIaLQkdZ_jlxJeM_hMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("El villancico del Real", "rtsp://v2.cache3.c.youtube.com/CjYLENy73wIaLQnhbpys2D_IphMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", ""));
			medias.add(new MediaModel("El villancico de Pepi�o", "rtsp://v7.cache8.c.youtube.com/CjYLENy73wIaLQmaOfOPYud3fRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Villancico de la crisis econ�mica", "rtsp://v2.cache8.c.youtube.com/CjYLENy73wIaLQkHqVCeBgNVyBMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Aznar se vuelve rapero", "rtsp://v3.cache1.c.youtube.com/CjYLENy73wIaLQlQIMe-OECj9BMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Rap"));
			medias.add(new MediaModel("Rajoy es un amanate bandido", "rtsp://v6.cache4.c.youtube.com/CjYLENy73wIaLQl7sP3zdXIOmxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Musical"));
			medias.add(new MediaModel("Humor japones", "rtsp://v5.cache7.c.youtube.com/CjYLENy73wIaLQnNo47Ye_NvdxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Scaner", "rtsp://v4.cache1.c.youtube.com/CjYLENy73wIaLQnw1Zn503ipZhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("La broma de los 100 japoneses", "rtsp://v3.cache7.c.youtube.com/CjYLENy73wIaLQnR8B5ktL7EFRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Mejores bromas 2012", "rtsp://v1.cache1.c.youtube.com/CjYLENy73wIaLQl1zjBJtqz34RMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Las 5 personas m�s gilipollas del mundo", "rtsp://v3.cache7.c.youtube.com/CjYLENy73wIaLQkbRADVHi5UmxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Golpes"));
			medias.add(new MediaModel("Top 10 bromas malvadas japoneses p2", "rtsp://v1.cache5.c.youtube.com/CjYLENy73wIaLQkpl_bo-sbVGxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Top 10 parking", "rtsp://v5.cache8.c.youtube.com/CjYLENy73wIaLQkB6xj8Fc8CXRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Aparcamiento"));
			medias.add(new MediaModel("Japoneses locos", "rtsp://v1.cache4.c.youtube.com/CjYLENy73wIaLQnvPtwTCggFRxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Top 10 bromas malvadas japoneses p1", "rtsp://v4.cache8.c.youtube.com/CjYLENy73wIaLQlaG-XsBO7HxRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Lo mejor de humor amarillo", "rtsp://v5.cache7.c.youtube.com/CjYLENy73wIaLQmdRMoUN1IeYhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Humor amarillo"));
			//medias.add(new MediaModel("", "", ""));
/*
			medias.add(new MediaModel("Campana sobre campana", "rtsp://v2.cache1.c.youtube.com/CjYLENy73wIaLQlwoUzjHUUkDxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Rodolfo el reno", "rtsp://v4.cache2.c.youtube.com/CjYLENy73wIaLQl-GeI54mQwPhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Cascabel", "rtsp://v6.cache1.c.youtube.com/CjYLENy73wIaLQknvAf9h-TmrRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Ande, ande, ande", "rtsp://v1.cache5.c.youtube.com/CjYLENy73wIaLQnRzj7pveJxAhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("25 de Diciembre", "rtsp://v4.cache1.c.youtube.com/CjYLENy73wIaLQnLVFmxD9GCJhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Dime ni�o de quien eres", "rtsp://v1.cache6.c.youtube.com/CjYLENy73wIaLQmwgFefNd2H1hMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("El peque�o tamborilero", "rtsp://v8.cache7.c.youtube.com/CjYLENy73wIaLQmDIZ5qrrViaRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("La Noraguena", "rtsp://v3.cache2.c.youtube.com/CjYLENy73wIaLQnIhMKCmAWKQRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Una pandereta suena", "rtsp://v3.cache3.c.youtube.com/CjYLENy73wIaLQmGLuZIyf__dhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Los peces en el r�o", "rtsp://v6.cache5.c.youtube.com/CjYLENy73wIaLQlpueCJQL4tBhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Ay, del chiquirrit�n", "rtsp://v2.cache3.c.youtube.com/CjYLENy73wIaLQnwztaDm0FDmRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Blanca Navidad", "rtsp://v4.cache8.c.youtube.com/CjYLENy73wIaLQlU9PdtaIxZIhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("La virgen y san Jos�", "rtsp://v4.cache4.c.youtube.com/CjYLENy73wIaLQnSVdSF4WmsyRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Una pandereta suena", "rtsp://v3.cache3.c.youtube.com/CjYLENy73wIaLQmGLuZIyf__dhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
*/			

		}
		if (jokes == null){
			jokes = new ArrayList<JokeModel>();
			jokes.add(new JokeModel("La gran fiesta", "Verde", "- Mami, c�mo es que papa es chino, tu blanca y yo soy negro?\n- Con lo que paso esa noche, agradece que no ladres."));
			jokes.add(new JokeModel("Era tan...", "Verde", "-El tipo era tan, pero tan viejo que lo llamaban �rbol de Navidad.\n- �Por qu�?.\n- Porque ten�a las bolas de adorno."));
			jokes.add(new JokeModel("Dos putas", "Verde", "Van dos putas en un ascensor, dice una: \n- Huele a polla, y la otra contesta:\n- Es que nadie se puede tirar un eructo"));
			jokes.add(new JokeModel("Follasteras", "Verde", "\n-Oye tu esas dos de ah� �son follasteras?\n-No, �que va! son co�ocidas."));
			jokes.add(new JokeModel("Espermatozoides", "Verde", "Le dice un espermatozoide a otro:\n- Oye t�o, �sabes si falta mucho para llegar al ovario?\n- Una barbaridad. �Todav�a vamos por la garganta!"));
			jokes.add(new JokeModel("Mujer", "Verde", "Un t�o y su mujer estaban compartiendo una botella de un buen vino, cuando �l dice:\n- Querida, apuesto que no eres capaz de decir algo que me ponga contento y triste a la vez!... \nLa mujer responde de inmediato: - ���Tu polla es la m�s grande de todo el pueblo!!! "));
			jokes.add(new JokeModel("Dolor de cabeza", "Verde", "Por la noche, previniendo que ser�a una vez m�s evitado por la esposa, el marido pens� en una salida. \nEntr� en el ba�o y se duch�. Minutos despu�s apareci� desnudo en la habitaci�n.\nLa esposa, al percibir al marido limpio y bien perfumado, dej� caer la revista que estaba leyendo y dice:\n- Ay, amor....estoy con un dolor de cabeza terrible!. \nEn ese momento ella not� que el pene del marido estaba todo cubierto por un polvo blanco. Sorprendida ella pregunto: \n- �Que es eso mi amor? \n- ASPIRINA EN POLVO, querida. �La quieres v�a oral o en supositorio?"));
			jokes.add(new JokeModel("El origen del preservativo", "Verde", "En la escuela Pepito presume ante sus amiguitos de saber qui�n invent� los preservativos.\n- �Qui�n invent� los preservativos?\n- Los Reyes Magos.\n- No puede ser...\n- S�, mi pap� me dijo que los Reyes llegaron con d�divas, regalos y con dones."));
			jokes.add(new JokeModel("Animales de fiesta", "Se abre el tel�n", "Primer acto: Sale una ballena tocando la bater�a.\nSegundo acto: Sale un elefante tocando el bajo.\nTercer acto: Sale un hipop�tamo tocando la guitarra el�ctrica.\nC�mo se llama la obra: Rock pesado"));
			jokes.add(new JokeModel("Nombres de japoneses", "Como se llama...", "�C�mo se llama el campe�n de buceo japon�s?\nTokofondo.\n�Y el subcampe�n?\nKasitoko."));
			jokes.add(new JokeModel("Hermano vegetariano", "Como se llama...", "�Sabes cu�l es el hermano vegetariano de Bruce Lee?\nBroco Lee"));
			jokes.add(new JokeModel("Pidiendo regalos", "Pap�, pap�", "�Pap�, Pap�! �Por Reyes quiero una bicicleta de monta�a!\nNi�o, t� adem�s de parapl�jico eres tonto"));		
			jokes.add(new JokeModel("Pap� No�", "Mam�, mam�", "le dice pepito a su mam�: mam� mam� mira Pap� No�;\n y le contesta la mam�: - si hijo pap� no es"));
			jokes.add(new JokeModel("Dos rubias", "Navidad", "Dos rubias se van al bosque a busca un pino para Navidad. Despu�s de dos horas de b�squeda, una le dice a la otra:\n- Bueno, ya es suficiente! El pr�ximo pino que veamos lo cogemos, tenga o no tenga bolas de Navidad!"));
			jokes.add(new JokeModel("Batman", "Superheroes", "�Qu� le regal� Batman a su mam� para navidad?\n- Una BatiDora."));
			jokes.add(new JokeModel("Regalo de reyes", "Reyes magos", "Mama, mama, para los reyes quiero droga!!!!\n- Los reyes no traen droga!\n- Pero los camellos si! "));
			jokes.add(new JokeModel("En el coche", "Inform�ticos", "Un inform�tico, un economista y un ingeniero van en un coche por la autov�a. De pronto el coche inexplicablemente se para. Los tres se ponen a pensar y dar soluciones. \nEl Ingeniero: - Ya est�, se llama a la gr�a y que nos traigan otro.\nEl economistas: - No, no, mejor tratamos de repararlo nosostros mismos.\nEl inf�m�tico: -Esto es muy f�cil: �salgamos y volvamos a entrar!"));
			jokes.add(new JokeModel("El cuerpo humano", "Ingenieros", "Tres ingenieros y el dise�o del cuerpo humano. \n- Obviamente, es una obra de un ingeniero mec�nico, f�jate en las articulaciones, en los huesos de la mano, en... \n- No hombre, fue un ingeniero el�ctrico, sino como explicamos el sistema nervioso, en lo complejo que es el cerebro, en... \n- Nah, t�os, ni idea, lo hizo un ingeniero civil; a nadie mas se le ocurre poner un desag�e toxico al lado de un �rea recreativa."));
			jokes.add(new JokeModel("Sr. Lisensiado", "Ingenieros", "Un ingeniero agr�nomo reci�n licenciado vuelve a la granja de su padre, y se da una vuelta con el. \n- Mira, papa, estas trabajando con unos m�todos demasiado anticuados que hacen que tu producci�n sea demasiado baja. Por ejemplo, �a que no puedes conseguir siquiera diez kilos de manzanas de cada uno de estos �rboles? \n- Claro que no, hijo. Esto son naranjos."));
			jokes.add(new JokeModel("Extinci�n", "Feministas", "�En qu� se parecen los dinosaurios con los hombres inteligentes?\nEn que los 2 se extinguieron."));
			jokes.add(new JokeModel("Idioteces", "Feministas", "�En qu� mes los hombres hacen menos idioteces? \nEn Febrero porque s�lo tiene 28 d�as."));
			jokes.add(new JokeModel("La bestia", "Feministas", "�Qu� hace una mujer cuando el marido se muere? \nDomesticar otra bestia."));
			jokes.add(new JokeModel("Belleza del hombre", "Feministas", "�Por qu� los hombres se miran tanto en un espejo? Para saber qu� clase de insectos son."));
			jokes.add(new JokeModel("Si importa", "Feministas", "Cual es la diferencia entre l�stima y lastima? El tama�o."));
			jokes.add(new JokeModel("Los restos del hombre", "Feministas", "Como se llama la porci�n de piel innecesaria que recubre el pene?\nHombre."));	
			jokes.add(new JokeModel("Diferencias", "Feministas", "La diferencia entre duro y oscuro?\nQue oscuro esta toda la noche."));
			jokes.add(new JokeModel("Viaje de matrimonio", "Machistas", "Cuando cumplimos 10 a�os de casados con mi mujer, la llev� a Jap�n? \n- �Que bueno!\n �Y cuando cumplas 20?\n - Bueno, ah� la voy a buscar."));
			jokes.add(new JokeModel("Comiendo", "Machistas", "Un hombre llega y se sienta a comer y su mujer le dice: - �Te sirvo?\nY �l contesta: - A veces."));
			jokes.add(new JokeModel("El matrimonio es..", "Machistas", "Cuando estas soltero te gustan todas, pero cuando estas casado te gustan todas menos una."));
			jokes.add(new JokeModel("Se comete un crimen", "Machistas", "Se comete un crimen y hay tres sospechosos. Papa Noel, un abogado y una mujer inteligente. \n�Quien fue? \nEl abogado, por que los otros dos no existen. "));
			jokes.add(new JokeModel("Diferencias", "Machistas", "Cual es la diferencia entre una esposa y una foca.\nUna huele a pescado, tiene bigotes, es gorda y no se le entiende lo que dice.\nLa otra vive en el mar."));
			jokes.add(new JokeModel("La culpa es de...", "Machistas", "Un hombre y una mujer chocan en una esquina, el hombre pas� en rojo y la chica en verde. �Quien tubo la culpa? la mujer, porque eran las 12 del mediodia y tenia que estar cocinando." ));
			jokes.add(new JokeModel("Mujer gorda", "Gordos", "- �Cu�l es el colmo de una mujer muy gorda?\n- Que se vista de amarillo y la gente le diga ���taxii, taxiii!!!"));
			jokes.add(new JokeModel("Se�ora gorda", "Gordos", "Era una se�ora tan gorda, pero tan gorda, que cuando sal�a en la televisi�n, sal�a en todos los canales."));
			jokes.add(new JokeModel("Mujer obesa", "Gordos", "Una mujer de 98 kilos va un especialista en diet�tica y nutrici�n para intentar adelgazar.\n- �Qu� hago doctor?, en los �ltimos meses me he hinchado a bombones, tartas y dulces y gan� 28 kilos.\n- Vamos a ver... abra la boca y diga muuuu."));
			jokes.add(new JokeModel("Ciego", "M�dicos", "Doctor, un ciego quiere verlo. D�gale que yo no hago milagros."));
			jokes.add(new JokeModel("La realidad", "M�dicos", "Felicidad va al m�dico y le dice: Doctor, tengo complejo de fea. \nDe complejo nada."));
			jokes.add(new JokeModel("Temblores", "M�dicos", "Doctor, me tiemblan mucho las manos.\n- Felicidad no ser� que bebes demasiado alcohol?\n- �Que va, si lo derramo casi todo!"));
			jokes.add(new JokeModel("Tres pechos", "M�dicos", "Doctor, mi mujer tiene tres pechos.\n- �Ah! Y quiere que le extirpe uno de ellos, �verdad?\n- No, que me implante a m� otra mano."));
			jokes.add(new JokeModel("Testiculos", "M�dicos", "Doctor, doctor, tengo un test�culo de hierro y otro de madera.\n- �Y usted tiene hijos?\n- S�, Robocop y Pinocho."));
			jokes.add(new JokeModel("Hueso", "M�dicos", "�Doctor!, �Doctor! �Tengo un hueso afuera!\n- �Pues dile que pase!"));
			jokes.add(new JokeModel("Peludo", "M�dicos", "Este es un hombre con muchos pelos que va al medico y pregunta: \n- �Doctor, doctor que padezco?\nY el doctor contesta: - padece un osito."));
			jokes.add(new JokeModel("Psicologo", "M�dicos", "Se�ora, en la pr�xima consulta ser� importante que analicemos el inconsciente.\n- Doctor, va a ser dif�cil que el desgraciado de mi marido quiera venir conmigo."));
			jokes.add(new JokeModel("Brazo", "M�dicos", "Doctor, doctor, me he roto el brazo en varios sitios.\n- Pues yo que usted no volver�a a esos sitios."));
			jokes.add(new JokeModel("Hijos", "M�dicos", "Doctor, �se pueden tener hijos despu�s de los 40?\n- Personalmente, se�ora, yo creo que con cuarenta ya hay bastante."));
			jokes.add(new JokeModel("Paperas", "M�dicos", "Doctor, tengo paperas. \n- Bueno, tome 10 pesos m�s y ya tiene pa platanos."));
			jokes.add(new JokeModel("Ping�inos", "Animales", "Un ping�ino entra en un bar y se dirige al camarero.\n- Perdone, �por casualidad ha visto usted a mi hermano?\n- No s�, �c�mo es?"));
			jokes.add(new JokeModel("Antig�edad", "Animales", "�Cu�l es el animal m�s antiguo? \nLa vaca\n�Por qu�?\nPorque esta en blanco y negro."));
			jokes.add(new JokeModel("Oevjas", "Animales", "Una familia de ovejas. \n-�Mam�!, �Mam�! �puedo ir a una fiesta?\n -Veee, veee."));
			jokes.add(new JokeModel("Toro", "Animales", "�En qu� se parece el toro vivo al toro muerto? En que el toro vivo embiste, y el toro muerto en bistec."));
			jokes.add(new JokeModel("Foca", "Animales", "Una foca entr� en una habitaci�n oscura y dijo: Aqu� lo que se necesita es un foco."));
			jokes.add(new JokeModel("Monjas", "Religiosos", "Dos monjas en el amazonas, las capturan y violan los nativos:\n- Perd�nales Se�or, porque no saben lo que hacen, dice una monja.\n- Ser� el tuyo, porque el m�o es un experto, dice la otra."));
			jokes.add(new JokeModel("Pecados", "Religiosos", "�Que puedo hacer con mis pecados, se�or cura?\n- Ora.\n-Las tres y cuarto, �pero que puedo hacer con mis pecados?"));
			jokes.add(new JokeModel("Campesino", "Religiosos", "Un campesino pasa por la puerta de la iglesia y el cura le invita a la misa. \nEl campesino le responde: - No puedo padre, �qui�n me cuidar� el caballo?; \n- Dios te lo cuidar�, hijo. \n- Bueno, dijo el campesino, y entr� a la iglesia. \nCuando el padre se dispon�a a comenzar la misa dice:- �Dios est� con nosotros! \nEl campesino se levanta enfurecido de su asiento y dice: - Entonces, �qui�n diantre me est� cuidando el caballo!"));
			jokes.add(new JokeModel("Piloto de aci�n", "Religiosos", "Esto es un piloto de avi�n, que se estrella en un convento de monjas, y justamente entre los naranjos y los limoneros del convento. Como por supuesto el piloto tiene la ropa rota, quemada, ensangrentada....\nEn eso que vienen dos monjas y una le dice a la otra: - Mira, hermana que limones mas guapos.\nY la otra dice: - Que no hermana que son naranjas. \nEn eso que ocurre una discusi�n entre las dos monjas;- Son naranjas, - Que no son limones, - Naranjas, - Limones, - No naranjas, - No limones... \nY el piloto medio muerto va y les dice: -Ni son naranjas ni son limones �Que son los huevos de mis cojones!"));
			jokes.add(new JokeModel("La iglesia", "Religiosos", "�Por qu� las puertas de las iglesias son tan altas? Para que entre el alt�simo."));
			jokes.add(new JokeModel("Real Madrid", "F�tbol", "�En qu� se parece la sala de trofeos del Real Madrid al Rastro?\n- En que todo es viejo, usado o robado."));
			jokes.add(new JokeModel("Santiago Bernanbeu", "F�tbol", "�Cual es el florero mas grande del mundo?\nEl bernabeu porque caben mas de 80.000 capullos"));
			jokes.add(new JokeModel("F.C.B.", "F�tbol", "Va un ni�o a la tienda del barcelona, y le dice el vendedor de que quieres la camiseta, de portero, jugador o arbitro....."));
			jokes.add(new JokeModel("Prostituta", "F�tbol", "Esto era una prostituta, que cierto d�a recibe a un cliente argentino. Se desnudan y �l ve con asombro que ella lleva dos tatuajes en los muslos.. Al ver su cara de asombro, ella le comenta: - Es que yo soy muy fan del F.C. Barcelona y llevo tatuados a sus mejores jugadores. Si adivinas qui�nes son, no te cobro el servicio.\nEl argentino mira los tatuajes y le dice: -Ch�, boluda, este de la derecha es el Diego, el Pelusa, ch� viste es Maradona. Pero el otro no s� qui�n es.\nEntonces te cobro la mitad, dijo ella.\nPasados unos d�as, estuvo con un cliente holand�s y le repiti� la misma historia.\n�ste dijo: Pues yo s�lo cunosco a Johann Cruyff, el mais grande del mondo, pero otro no saber quien es. \n- Te cobro la mitad, dijo ella nuevamente.\nFinalmente, estuvo con un cliente del Bar�a, le repiti� la misma historia, �l mir� los tatuajes y le dijo: - �ste de la derecha es Maradona, el de la izquierda es Cruyff... y �ste del medio, por el pelo rizado y loslabios colgando ES RONALDINHO!!!! "));
			jokes.add(new JokeModel("Pobres", "Chinos", "- Cuales son los m�s pobres de China? \nChin-lu, chin-gas, y chin-agua"));
			jokes.add(new JokeModel("Chino molesto", "Chinos", "Un chino que va y le dice a su vecino: - Curro que se callen los perros.\n  Pero los perros no se callaban... \nEl chino fue a la polic�a y les comenta: - lo pelos del culo no me dejan dolmil. - y le dice el polic�a pues af�iteselos marrano. "));
			jokes.add(new JokeModel("Ajedrez", "Gitanos", "Dos gitanos jugando al ajedrez y uno le dice al otro:\n- Jaque mate con el caballo.\nEl otro contesta: - Haaala!!! Y tu ja te mates con la fregoneta!!!."));
			jokes.add(new JokeModel("Dudas", "Gitanos", "Est�n hablando dos gitanos, y uno le pregunta:\n- �que zoy? \n- un hijoputa \n- �no, de d�a! \n-de dia y de noche"));
			jokes.add(new JokeModel("Robando", "Gitanos", "Esto son dos gitanos que van a robar gallinas, llegan a la granja y se llevan un pu�ao. \nSale el granjero a la ma�ana siguiente: \n- me cago en t� que me han robao las gallinas, de esta noche no pasan. \nLlega la noche y el granjero se esconde detr�s de la puerta con una pala. Se asoma un gitano� plas, zapatazo, sale pa fuera con la boca tap� y le dice su compadre: \n- compadre que te pasa, y le contesta el otro: \n- entra t� que a mi me da la risa."));
			jokes.add(new JokeModel("Las flechas de cupido", "Amor", "Un chico en una discoteca, simulando que lanza flechas a varias chicas. Una ve como le lanza una. Ella le mira, sonr�e y se acerca interesada.\n- Hola.\n- Hola - responde �l. \n- He visto que me lanzabas una flecha. �Eres cupido lanzando flechas de amor?\n- �No! ���Soy legolas matando Orcos!!!"));
			//jokes.add(new JokeModel("", "", ""));
		}
		if (postals == null){
			postals = new ArrayList<PostalModel>();
			postals.add(new PostalModel("Mu�eco nieve", "Felicitaci�n","t1.jpg"));
			postals.add(new PostalModel("Abeto", "Navidad","t2.jpg"));
			postals.add(new PostalModel("Canci�n de navidad", "Navidad","t3.jpg"));
			postals.add(new PostalModel("Papa noel", "Navidad","t4.jpg"));
			postals.add(new PostalModel("Felices fiestas", "Felicitaci�n","t5.jpg"));
			postals.add(new PostalModel("Merry Christmas", "Felicitaci�n","t6.jpg"));
			postals.add(new PostalModel("Abeto", "Navidad","t7.jpg"));
			postals.add(new PostalModel("Abeto", "Felicitaci�n","t8.jpg"));
			postals.add(new PostalModel("Abeto", "Navidad","t9.jpg"));
			/*
			postals.add(new PostalModel("", "","t10.jpg"));
			postals.add(new PostalModel("", "","t11.jpg"));
			postals.add(new PostalModel("", "","t12.jpg"));
			postals.add(new PostalModel("", "","t13.jpg"));
			postals.add(new PostalModel("", "","t14.jpg"));
			postals.add(new PostalModel("", "","t15.jpg"));
			postals.add(new PostalModel("", "","t16.jpg"));
			postals.add(new PostalModel("", "","t17.jpg"));
			postals.add(new PostalModel("", "","t18.jpg"));
			postals.add(new PostalModel("", "","t19.jpg"));
			*/
			/*
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			postals.add(new PostalModel("", "",""));
			*/

		}
	}
	
	public MediaModel getMedia(int position){
		if (medias != null && medias.size() > position){
			return medias.get(position);
		}else{
			return null;
		}
	} 
	
	public JokeModel getJoke(int position){
		if (jokes != null && jokes.size() > position){
			return jokes.get(position);
		}else{
			return null;
		}
	} 
	
	public PostalModel getPostal(int position){
		if (postals != null && postals.size() > position){
			return postals.get(position);
		}else{
			return null;
		}
	} 
	
	public int getMediasSize(){
		if (medias != null)
			return medias.size();
		else return 0;
	}

	public int getJokesSize(){
		if (jokes != null)
			return jokes.size();
		else return 0;
	}
	
	public int getPostalSize(){
		if (postals != null)
			return postals.size();
		else return 0;
	}
}
