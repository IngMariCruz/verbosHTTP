Proyecto CruzMarianaVerbosHTTP

Descripción del Proyecto
Este proyecto es un ejemplo práctico que demuestra el uso de los verbos HTTP dentro de un servicio web creado con Spring Boot. El servicio interactúa con una base de datos NoSQL, MongoDB, para realizar operaciones CRUD básicas (Crear, Leer, Actualizar y Eliminar).

Definición de los Verbos HTTP
GET:
El verbo GET se utiliza para solicitar datos de un servidor. En este servicio, el método asociado es getAll(), que devuelve todos los elementos almacenados.

POST:
El verbo POST se utiliza para enviar datos al servidor, típicamente para crear un nuevo recurso. El método insert() en este servicio permite agregar un nuevo elemento a la base de datos.

PUT:
El verbo PUT se utiliza para actualizar un recurso existente en el servidor. El método update() se encarga de modificar un elemento existente basado en el ID proporcionado.

DELETE:
El verbo DELETE se utiliza para eliminar un recurso del servidor. En este servicio, el método deleteItem() permite eliminar un elemento específico usando su ID.

PATCH:
El verbo PATCH se utiliza para aplicar modificaciones parciales a un recurso existente. El método updateData() permite actualizar partes específicas de un elemento, como su nombre o categoría.

HEAD:
El verbo HEAD se utiliza para obtener los encabezados de una respuesta HTTP sin el cuerpo. El método handleHeadRequest() implementa este verbo en el servicio.

Anotaciones Utilizadas
@RestController:
Esta anotación marca la clase como un controlador de Spring MVC, capaz de manejar solicitudes HTTP y devolver respuestas en formato JSON o XML.

@RequestMapping("item"):
Define el prefijo de la URL para todas las rutas manejadas por los métodos dentro de la clase. En este caso, todas las rutas comenzarán con /item.

@Autowired:
Esta anotación permite la inyección automática de dependencias gestionadas por Spring, como el servicio ItemService en el controlador ItemController.

Clase GroceryItem
La clase GroceryItem es el modelo de datos utilizado para representar los elementos almacenados en la base de datos. Contiene los siguientes atributos:

id: Identificador único del elemento.
name: Nombre del producto.
quantity: Cantidad disponible.
category: Categoría a la que pertenece el producto.
Método toString()
El método toString() en la clase GroceryItem está sobrescrito para proporcionar una representación en cadena del objeto, incluyendo todos sus atributos. Esto facilita la visualización de los datos cuando se imprime el objeto.

Anotación @Override
La anotación @Override se utiliza para indicar que un método está sobrescribiendo un método de la superclase. En este caso, se utiliza para sobrescribir el método toString() de la clase base Object.
