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
			medias.add(new MediaModel("El villancico de Pepiño", "rtsp://v7.cache8.c.youtube.com/CjYLENy73wIaLQmaOfOPYud3fRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Villancico de la crisis económica", "rtsp://v2.cache8.c.youtube.com/CjYLENy73wIaLQkHqVCeBgNVyBMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Aznar se vuelve rapero", "rtsp://v3.cache1.c.youtube.com/CjYLENy73wIaLQlQIMe-OECj9BMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Rap"));
			medias.add(new MediaModel("Rajoy es un amanate bandido", "rtsp://v6.cache4.c.youtube.com/CjYLENy73wIaLQl7sP3zdXIOmxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Musical"));
			medias.add(new MediaModel("Humor japones", "rtsp://v5.cache7.c.youtube.com/CjYLENy73wIaLQnNo47Ye_NvdxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Scaner", "rtsp://v4.cache1.c.youtube.com/CjYLENy73wIaLQnw1Zn503ipZhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("La broma de los 100 japoneses", "rtsp://v3.cache7.c.youtube.com/CjYLENy73wIaLQnR8B5ktL7EFRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Mejores bromas 2012", "rtsp://v1.cache1.c.youtube.com/CjYLENy73wIaLQl1zjBJtqz34RMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Bromas"));
			medias.add(new MediaModel("Las 5 personas más gilipollas del mundo", "rtsp://v3.cache7.c.youtube.com/CjYLENy73wIaLQkbRADVHi5UmxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Golpes"));
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
			medias.add(new MediaModel("Dime niño de quien eres", "rtsp://v1.cache6.c.youtube.com/CjYLENy73wIaLQmwgFefNd2H1hMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("El pequeño tamborilero", "rtsp://v8.cache7.c.youtube.com/CjYLENy73wIaLQmDIZ5qrrViaRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("La Noraguena", "rtsp://v3.cache2.c.youtube.com/CjYLENy73wIaLQnIhMKCmAWKQRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Una pandereta suena", "rtsp://v3.cache3.c.youtube.com/CjYLENy73wIaLQmGLuZIyf__dhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Los peces en el río", "rtsp://v6.cache5.c.youtube.com/CjYLENy73wIaLQlpueCJQL4tBhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Ay, del chiquirritín", "rtsp://v2.cache3.c.youtube.com/CjYLENy73wIaLQnwztaDm0FDmRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Blanca Navidad", "rtsp://v4.cache8.c.youtube.com/CjYLENy73wIaLQlU9PdtaIxZIhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("La virgen y san José", "rtsp://v4.cache4.c.youtube.com/CjYLENy73wIaLQnSVdSF4WmsyRMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
			medias.add(new MediaModel("Una pandereta suena", "rtsp://v3.cache3.c.youtube.com/CjYLENy73wIaLQmGLuZIyf__dhMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYMbvibHB_baQUAw=/0/0/0/video.3gp", "Villancico"));
*/			

		}
		if (jokes == null){
			jokes = new ArrayList<JokeModel>();
			jokes.add(new JokeModel("La gran fiesta", "Verde", "- Mami, cómo es que papa es chino, tu blanca y yo soy negro?\n- Con lo que paso esa noche, agradece que no ladres."));
			jokes.add(new JokeModel("Era tan...", "Verde", "-El tipo era tan, pero tan viejo que lo llamaban Árbol de Navidad.\n- ¿Por qué?.\n- Porque tenía las bolas de adorno."));
			jokes.add(new JokeModel("Dos putas", "Verde", "Van dos putas en un ascensor, dice una: \n- Huele a polla, y la otra contesta:\n- Es que nadie se puede tirar un eructo"));
			jokes.add(new JokeModel("Follasteras", "Verde", "\n-Oye tu esas dos de ahí ¿son follasteras?\n-No, ¡que va! son coñocidas."));
			jokes.add(new JokeModel("Espermatozoides", "Verde", "Le dice un espermatozoide a otro:\n- Oye tío, ¿sabes si falta mucho para llegar al ovario?\n- Una barbaridad. ¡Todavía vamos por la garganta!"));
			jokes.add(new JokeModel("Mujer", "Verde", "Un tío y su mujer estaban compartiendo una botella de un buen vino, cuando él dice:\n- Querida, apuesto que no eres capaz de decir algo que me ponga contento y triste a la vez!... \nLa mujer responde de inmediato: - ¡¡¡Tu polla es la más grande de todo el pueblo!!! "));
			jokes.add(new JokeModel("Dolor de cabeza", "Verde", "Por la noche, previniendo que sería una vez más evitado por la esposa, el marido pensó en una salida. \nEntró en el baño y se duchó. Minutos después apareció desnudo en la habitación.\nLa esposa, al percibir al marido limpio y bien perfumado, dejó caer la revista que estaba leyendo y dice:\n- Ay, amor....estoy con un dolor de cabeza terrible!. \nEn ese momento ella notó que el pene del marido estaba todo cubierto por un polvo blanco. Sorprendida ella pregunto: \n- ¿Que es eso mi amor? \n- ASPIRINA EN POLVO, querida. ¿La quieres vía oral o en supositorio?"));
			jokes.add(new JokeModel("El origen del preservativo", "Verde", "En la escuela Pepito presume ante sus amiguitos de saber quién inventó los preservativos.\n- ¿Quién inventó los preservativos?\n- Los Reyes Magos.\n- No puede ser...\n- Sí, mi papá me dijo que los Reyes llegaron con dádivas, regalos y con dones."));
			jokes.add(new JokeModel("Animales de fiesta", "Se abre el telón", "Primer acto: Sale una ballena tocando la batería.\nSegundo acto: Sale un elefante tocando el bajo.\nTercer acto: Sale un hipopótamo tocando la guitarra eléctrica.\nCómo se llama la obra: Rock pesado"));
			jokes.add(new JokeModel("Nombres de japoneses", "Como se llama...", "¿Cómo se llama el campeón de buceo japonés?\nTokofondo.\n¿Y el subcampeón?\nKasitoko."));
			jokes.add(new JokeModel("Hermano vegetariano", "Como se llama...", "¿Sabes cuál es el hermano vegetariano de Bruce Lee?\nBroco Lee"));
			jokes.add(new JokeModel("Pidiendo regalos", "Papá, papá", "¡Papá, Papá! ¡Por Reyes quiero una bicicleta de montaña!\nNiño, tú además de parapléjico eres tonto"));		
			jokes.add(new JokeModel("Papá Noé", "Mamá, mamá", "le dice pepito a su mamá: mamá mamá mira Papá Noé;\n y le contesta la mamá: - si hijo papá no es"));
			jokes.add(new JokeModel("Dos rubias", "Navidad", "Dos rubias se van al bosque a busca un pino para Navidad. Después de dos horas de búsqueda, una le dice a la otra:\n- Bueno, ya es suficiente! El próximo pino que veamos lo cogemos, tenga o no tenga bolas de Navidad!"));
			jokes.add(new JokeModel("Batman", "Superheroes", "¿Qué le regaló Batman a su mamá para navidad?\n- Una BatiDora."));
			jokes.add(new JokeModel("Regalo de reyes", "Reyes magos", "Mama, mama, para los reyes quiero droga!!!!\n- Los reyes no traen droga!\n- Pero los camellos si! "));
			jokes.add(new JokeModel("En el coche", "Informáticos", "Un informático, un economista y un ingeniero van en un coche por la autovía. De pronto el coche inexplicablemente se para. Los tres se ponen a pensar y dar soluciones. \nEl Ingeniero: - Ya está, se llama a la grúa y que nos traigan otro.\nEl economistas: - No, no, mejor tratamos de repararlo nosostros mismos.\nEl infómático: -Esto es muy fácil: ¡salgamos y volvamos a entrar!"));
			jokes.add(new JokeModel("El cuerpo humano", "Ingenieros", "Tres ingenieros y el diseño del cuerpo humano. \n- Obviamente, es una obra de un ingeniero mecánico, fíjate en las articulaciones, en los huesos de la mano, en... \n- No hombre, fue un ingeniero eléctrico, sino como explicamos el sistema nervioso, en lo complejo que es el cerebro, en... \n- Nah, tíos, ni idea, lo hizo un ingeniero civil; a nadie mas se le ocurre poner un desagüe toxico al lado de un área recreativa."));
			jokes.add(new JokeModel("Sr. Lisensiado", "Ingenieros", "Un ingeniero agrónomo recién licenciado vuelve a la granja de su padre, y se da una vuelta con el. \n- Mira, papa, estas trabajando con unos métodos demasiado anticuados que hacen que tu producción sea demasiado baja. Por ejemplo, ¿a que no puedes conseguir siquiera diez kilos de manzanas de cada uno de estos árboles? \n- Claro que no, hijo. Esto son naranjos."));
			jokes.add(new JokeModel("Extinción", "Feministas", "¿En qué se parecen los dinosaurios con los hombres inteligentes?\nEn que los 2 se extinguieron."));
			jokes.add(new JokeModel("Idioteces", "Feministas", "¿En qué mes los hombres hacen menos idioteces? \nEn Febrero porque sólo tiene 28 días."));
			jokes.add(new JokeModel("La bestia", "Feministas", "¿Qué hace una mujer cuando el marido se muere? \nDomesticar otra bestia."));
			jokes.add(new JokeModel("Belleza del hombre", "Feministas", "¿Por qué los hombres se miran tanto en un espejo? Para saber qué clase de insectos son."));
			jokes.add(new JokeModel("Si importa", "Feministas", "Cual es la diferencia entre lástima y lastima? El tamaño."));
			jokes.add(new JokeModel("Los restos del hombre", "Feministas", "Como se llama la porción de piel innecesaria que recubre el pene?\nHombre."));	
			jokes.add(new JokeModel("Diferencias", "Feministas", "La diferencia entre duro y oscuro?\nQue oscuro esta toda la noche."));
			jokes.add(new JokeModel("Viaje de matrimonio", "Machistas", "Cuando cumplimos 10 años de casados con mi mujer, la llevé a Japón? \n- ¡Que bueno!\n ¿Y cuando cumplas 20?\n - Bueno, ahí la voy a buscar."));
			jokes.add(new JokeModel("Comiendo", "Machistas", "Un hombre llega y se sienta a comer y su mujer le dice: - ¿Te sirvo?\nY él contesta: - A veces."));
			jokes.add(new JokeModel("El matrimonio es..", "Machistas", "Cuando estas soltero te gustan todas, pero cuando estas casado te gustan todas menos una."));
			jokes.add(new JokeModel("Se comete un crimen", "Machistas", "Se comete un crimen y hay tres sospechosos. Papa Noel, un abogado y una mujer inteligente. \n¿Quien fue? \nEl abogado, por que los otros dos no existen. "));
			jokes.add(new JokeModel("Diferencias", "Machistas", "Cual es la diferencia entre una esposa y una foca.\nUna huele a pescado, tiene bigotes, es gorda y no se le entiende lo que dice.\nLa otra vive en el mar."));
			jokes.add(new JokeModel("La culpa es de...", "Machistas", "Un hombre y una mujer chocan en una esquina, el hombre pasó en rojo y la chica en verde. ¿Quien tubo la culpa? la mujer, porque eran las 12 del mediodia y tenia que estar cocinando." ));
			jokes.add(new JokeModel("Mujer gorda", "Gordos", "- ¿Cuál es el colmo de una mujer muy gorda?\n- Que se vista de amarillo y la gente le diga ¡¡¡taxii, taxiii!!!"));
			jokes.add(new JokeModel("Señora gorda", "Gordos", "Era una señora tan gorda, pero tan gorda, que cuando salía en la televisión, salía en todos los canales."));
			jokes.add(new JokeModel("Mujer obesa", "Gordos", "Una mujer de 98 kilos va un especialista en dietética y nutrición para intentar adelgazar.\n- ¿Qué hago doctor?, en los últimos meses me he hinchado a bombones, tartas y dulces y gané 28 kilos.\n- Vamos a ver... abra la boca y diga muuuu."));
			jokes.add(new JokeModel("Ciego", "Médicos", "Doctor, un ciego quiere verlo. Dígale que yo no hago milagros."));
			jokes.add(new JokeModel("La realidad", "Médicos", "Felicidad va al médico y le dice: Doctor, tengo complejo de fea. \nDe complejo nada."));
			jokes.add(new JokeModel("Temblores", "Médicos", "Doctor, me tiemblan mucho las manos.\n- Felicidad no será que bebes demasiado alcohol?\n- ¡Que va, si lo derramo casi todo!"));
			jokes.add(new JokeModel("Tres pechos", "Médicos", "Doctor, mi mujer tiene tres pechos.\n- ¡Ah! Y quiere que le extirpe uno de ellos, ¿verdad?\n- No, que me implante a mí otra mano."));
			jokes.add(new JokeModel("Testiculos", "Médicos", "Doctor, doctor, tengo un testículo de hierro y otro de madera.\n- ¿Y usted tiene hijos?\n- Sí, Robocop y Pinocho."));
			jokes.add(new JokeModel("Hueso", "Médicos", "¡Doctor!, ¡Doctor! ¡Tengo un hueso afuera!\n- ¡Pues dile que pase!"));
			jokes.add(new JokeModel("Peludo", "Médicos", "Este es un hombre con muchos pelos que va al medico y pregunta: \n- ¿Doctor, doctor que padezco?\nY el doctor contesta: - padece un osito."));
			jokes.add(new JokeModel("Psicologo", "Médicos", "Señora, en la próxima consulta será importante que analicemos el inconsciente.\n- Doctor, va a ser difícil que el desgraciado de mi marido quiera venir conmigo."));
			jokes.add(new JokeModel("Brazo", "Médicos", "Doctor, doctor, me he roto el brazo en varios sitios.\n- Pues yo que usted no volvería a esos sitios."));
			jokes.add(new JokeModel("Hijos", "Médicos", "Doctor, ¿se pueden tener hijos después de los 40?\n- Personalmente, señora, yo creo que con cuarenta ya hay bastante."));
			jokes.add(new JokeModel("Paperas", "Médicos", "Doctor, tengo paperas. \n- Bueno, tome 10 pesos más y ya tiene pa platanos."));
			jokes.add(new JokeModel("Pingüinos", "Animales", "Un pingüino entra en un bar y se dirige al camarero.\n- Perdone, ¿por casualidad ha visto usted a mi hermano?\n- No sé, ¿cómo es?"));
			jokes.add(new JokeModel("Antigüedad", "Animales", "¿Cuál es el animal más antiguo? \nLa vaca\n¿Por qué?\nPorque esta en blanco y negro."));
			jokes.add(new JokeModel("Oevjas", "Animales", "Una familia de ovejas. \n-¡Mamá!, ¡Mamá! ¿puedo ir a una fiesta?\n -Veee, veee."));
			jokes.add(new JokeModel("Toro", "Animales", "¿En qué se parece el toro vivo al toro muerto? En que el toro vivo embiste, y el toro muerto en bistec."));
			jokes.add(new JokeModel("Foca", "Animales", "Una foca entró en una habitación oscura y dijo: Aquí lo que se necesita es un foco."));
			jokes.add(new JokeModel("Monjas", "Religiosos", "Dos monjas en el amazonas, las capturan y violan los nativos:\n- Perdónales Señor, porque no saben lo que hacen, dice una monja.\n- Será el tuyo, porque el mío es un experto, dice la otra."));
			jokes.add(new JokeModel("Pecados", "Religiosos", "¿Que puedo hacer con mis pecados, señor cura?\n- Ora.\n-Las tres y cuarto, ¿pero que puedo hacer con mis pecados?"));
			jokes.add(new JokeModel("Campesino", "Religiosos", "Un campesino pasa por la puerta de la iglesia y el cura le invita a la misa. \nEl campesino le responde: - No puedo padre, ¿quién me cuidará el caballo?; \n- Dios te lo cuidará, hijo. \n- Bueno, dijo el campesino, y entró a la iglesia. \nCuando el padre se disponía a comenzar la misa dice:- ¡Dios está con nosotros! \nEl campesino se levanta enfurecido de su asiento y dice: - Entonces, ¡quién diantre me está cuidando el caballo!"));
			jokes.add(new JokeModel("Piloto de ación", "Religiosos", "Esto es un piloto de avión, que se estrella en un convento de monjas, y justamente entre los naranjos y los limoneros del convento. Como por supuesto el piloto tiene la ropa rota, quemada, ensangrentada....\nEn eso que vienen dos monjas y una le dice a la otra: - Mira, hermana que limones mas guapos.\nY la otra dice: - Que no hermana que son naranjas. \nEn eso que ocurre una discusión entre las dos monjas;- Son naranjas, - Que no son limones, - Naranjas, - Limones, - No naranjas, - No limones... \nY el piloto medio muerto va y les dice: -Ni son naranjas ni son limones ¡Que son los huevos de mis cojones!"));
			jokes.add(new JokeModel("La iglesia", "Religiosos", "¿Por qué las puertas de las iglesias son tan altas? Para que entre el altísimo."));
			jokes.add(new JokeModel("Real Madrid", "Fútbol", "¿En qué se parece la sala de trofeos del Real Madrid al Rastro?\n- En que todo es viejo, usado o robado."));
			jokes.add(new JokeModel("Santiago Bernanbeu", "Fútbol", "¿Cual es el florero mas grande del mundo?\nEl bernabeu porque caben mas de 80.000 capullos"));
			jokes.add(new JokeModel("F.C.B.", "Fútbol", "Va un niño a la tienda del barcelona, y le dice el vendedor de que quieres la camiseta, de portero, jugador o arbitro....."));
			jokes.add(new JokeModel("Prostituta", "Fútbol", "Esto era una prostituta, que cierto día recibe a un cliente argentino. Se desnudan y él ve con asombro que ella lleva dos tatuajes en los muslos.. Al ver su cara de asombro, ella le comenta: - Es que yo soy muy fan del F.C. Barcelona y llevo tatuados a sus mejores jugadores. Si adivinas quiénes son, no te cobro el servicio.\nEl argentino mira los tatuajes y le dice: -Ché, boluda, este de la derecha es el Diego, el Pelusa, ché viste es Maradona. Pero el otro no sé quién es.\nEntonces te cobro la mitad, dijo ella.\nPasados unos días, estuvo con un cliente holandés y le repitió la misma historia.\nÉste dijo: Pues yo sólo cunosco a Johann Cruyff, el mais grande del mondo, pero otro no saber quien es. \n- Te cobro la mitad, dijo ella nuevamente.\nFinalmente, estuvo con un cliente del Barça, le repitió la misma historia, él miró los tatuajes y le dijo: - Éste de la derecha es Maradona, el de la izquierda es Cruyff... y éste del medio, por el pelo rizado y loslabios colgando ES RONALDINHO!!!! "));
			jokes.add(new JokeModel("Pobres", "Chinos", "- Cuales son los más pobres de China? \nChin-lu, chin-gas, y chin-agua"));
			jokes.add(new JokeModel("Chino molesto", "Chinos", "Un chino que va y le dice a su vecino: - Curro que se callen los perros.\n  Pero los perros no se callaban... \nEl chino fue a la policía y les comenta: - lo pelos del culo no me dejan dolmil. - y le dice el policía pues aféiteselos marrano. "));
			jokes.add(new JokeModel("Ajedrez", "Gitanos", "Dos gitanos jugando al ajedrez y uno le dice al otro:\n- Jaque mate con el caballo.\nEl otro contesta: - Haaala!!! Y tu ja te mates con la fregoneta!!!."));
			jokes.add(new JokeModel("Dudas", "Gitanos", "Están hablando dos gitanos, y uno le pregunta:\n- ¿que zoy? \n- un hijoputa \n- ¡no, de día! \n-de dia y de noche"));
			jokes.add(new JokeModel("Robando", "Gitanos", "Esto son dos gitanos que van a robar gallinas, llegan a la granja y se llevan un puñao. \nSale el granjero a la mañana siguiente: \n- me cago en tó que me han robao las gallinas, de esta noche no pasan. \nLlega la noche y el granjero se esconde detrás de la puerta con una pala. Se asoma un gitano… plas, zapatazo, sale pa fuera con la boca tapá y le dice su compadre: \n- compadre que te pasa, y le contesta el otro: \n- entra tú que a mi me da la risa."));
			jokes.add(new JokeModel("Las flechas de cupido", "Amor", "Un chico en una discoteca, simulando que lanza flechas a varias chicas. Una ve como le lanza una. Ella le mira, sonríe y se acerca interesada.\n- Hola.\n- Hola - responde él. \n- He visto que me lanzabas una flecha. ¿Eres cupido lanzando flechas de amor?\n- ¡No! ¡¡¡Soy legolas matando Orcos!!!"));
			//jokes.add(new JokeModel("", "", ""));
		}
		if (postals == null){
			postals = new ArrayList<PostalModel>();
			postals.add(new PostalModel("Muñeco nieve", "Felicitación","t1.jpg"));
			postals.add(new PostalModel("Abeto", "Navidad","t2.jpg"));
			postals.add(new PostalModel("Canción de navidad", "Navidad","t3.jpg"));
			postals.add(new PostalModel("Papa noel", "Navidad","t4.jpg"));
			postals.add(new PostalModel("Felices fiestas", "Felicitación","t5.jpg"));
			postals.add(new PostalModel("Merry Christmas", "Felicitación","t6.jpg"));
			postals.add(new PostalModel("Abeto", "Navidad","t7.jpg"));
			postals.add(new PostalModel("Abeto", "Felicitación","t8.jpg"));
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
