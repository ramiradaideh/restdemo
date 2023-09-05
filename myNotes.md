# Summary: Model-View-Controller (MVC) in Spring

Seeing a complete example using `@Controller` and `ViewResolver` makes it much easier to understand Spring's Model-View-Controller (MVC) concept.

## Controller
With just a few annotations (`@Controller`, `@PostMapping`, `@RequestParam`), you can create a controller in Spring that efficiently handles incoming requests and processes data accordingly. The controller serves as the bridge between client requests and the application's logic.

## Model
In MVC, the Model component contains all the data you intend to render in your view. It's essential to maintain a strict separation, including only the data required for the view. Populating this model map with the necessary data is your responsibility.

## View
The View, typically an HTML template, plays a crucial role in presenting data to users. It remains oblivious to the source of the data (the model), the current HTTP request, or the status of the HTTP session. Its sole purpose is to render the HTML output based on the data provided by the model.

In summary, Spring's MVC architecture encourages a clear separation of concerns in your web application. The Controller manages requests, processes data, and controls application flow. The Model holds the data, while the View is responsible for displaying it in an HTML template. This separation enhances organization, maintainability, and scalability in your application.
