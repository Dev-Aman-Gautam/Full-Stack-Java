# FullStack-Curriculum

├── Frontend/
│   ├── HTML/
│   │   ├── 01_Basics/
│   │   │   ├── 01_Introduction.md         // What is HTML? Its role, history, and evolution
│   │   │   ├── 02_Document_Structure.md     // DOCTYPE, html, head, body, charset, etc.
│   │   │   ├── 03_Core_Elements.md          // Headings, paragraphs, div, span, comments, etc.
│   │   │   ├── 04_Lists.md                  // Unordered, ordered, and description lists
│   │   │   ├── 05_Links_Navigation.md       // Hyperlinks, relative vs. absolute paths
│   │   │   ├── 06_Images_Multimedia.md      // Inserting images and media basics
│   │   │   ├── 07_Tables.md                 // Tables, thead, tbody, tfoot
│   │   │   ├── 08_Forms.md                  // Forms and input elements; GET vs. POST
│   │   │   └── 09_Semantic_HTML.md          // Semantic tags for SEO and accessibility
│   │   └── 02_Advanced/
│   │       ├── 01_HTML5_NewFeatures.md      // New semantic elements, multimedia integration, lazy loading
│   │       └── 02_Performance_Best_Practices.md
│   ├── CSS/
│   │   ├── 01_Basics/
│   │   │   ├── 01_Introduction.md           // What is CSS? Inline, internal, external
│   │   │   ├── 02_Selectors.md              // Element, class, id, grouping, nesting
│   │   │   ├── 03_Colors_Backgrounds.md     // Colors (HEX, RGB, HSL), backgrounds, gradients
│   │   │   ├── 04_Typography.md             // Fonts, sizes, text effects
│   │   │   ├── 05_Box_Model.md              // Padding, margin, border, box-sizing, overflow
│   │   │   ├── 06_Positioning.md            // Static, relative, absolute, fixed, sticky, z-index
│   │   │   ├── 07_Layouts.md                // Display, float, Flexbox basics, Grid basics
│   │   │   ├── 08_Responsive_Design.md      // Media queries, fluid units, responsive images
│   │   │   └── 09_Best_Practices.md         // Clean CSS, reset vs. normalize, debugging
│   │   └── 02_Advanced/
│   │       ├── 01_Advanced_Selectors.md     // Attribute, pseudo-classes, pseudo-elements
│   │       ├── 02_Flexbox_DeepDive.md       // Advanced flex container and item properties
│   │       ├── 03_CSS_Grid_DeepDive.md      // Grid template areas, auto-placement, subgrid
│   │       ├── 04_Transitions_Animations.md // Transitions, keyframe animations, parallax, etc.
│   │       ├── 05_Advanced_Responsive.md    // CSS clamp, container queries, dark mode
│   │       └── 06_Modern_CSS.md             // CSS variables, new features, SVG styling
│   ├── JavaScript/
│   │   ├── 01_Basics/
│   │   │   ├── 01_Introduction.md           // What is JavaScript? Role and history
│   │   │   ├── 02_Syntax.md                 // Basic syntax, code structure, comments
│   │   │   ├── 03_Variables_and_DataTypes.md// var, let, const; primitive and reference types
│   │   │   ├── 04_Operators.md              // Arithmetic, comparison, logical, ternary
│   │   │   ├── 05_Control_Flow.md           // if/else, switch, loops, break/continue
│   │   │   ├── 06_Functions_and_Scope.md    // Declarations, expressions, arrow functions, hoisting
│   │   │   └── 07_Arrays_and_Objects.md     // Arrays, methods, objects, destructuring, spread
│   │   ├── 02_Intermediate/
│   │   │   ├── 01_DOM_Manipulation.md       // Selecting and modifying DOM elements, events
│   │   │   ├── 02_ES6_Features.md           // Template literals, destructuring, spread/rest, for of
│   │   │   ├── 03_Asynchronous_JS.md        // Callbacks, promises, async/await, error handling
│   │   │   └── 04_Modern_JS_Best_Practices.md// Modules, debugging, performance tips
│   │   └── 03_Advanced/
│   │       ├── 01_Advanced_Functional.md    // Higher-order functions, currying, composition
│   │       ├── 02_Advanced_Async.md         // Event loop, microtasks, advanced promise patterns
│   │       └── 03_Testing_JS.md             // Unit testing, integration testing (Jest, Mocha)
│   ├── ReactJS/
│   │   ├── 01_Basics/
│   │   │   ├── 01_Introduction.md           // What is React? Virtual DOM, JSX, components
│   │   │   ├── 02_Setup.md                  // Using Create-React-App, folder structure
│   │   │   ├── 03_JSX_Syntax.md             // Writing JSX, expressions, conditional rendering
│   │   │   ├── 04_Components_Basics.md      // Functional vs. class components, props, events
│   │   ├── 02_State_and_Hooks/
│   │   │   ├── 01_useState.md               // State management in functional components
│   │   │   ├── 02_useEffect.md              // Side effects, lifecycle with hooks
│   │   │   ├── 03_useContext.md             // Context API for global state
│   │   │   └── 04_Custom_Hooks.md           // Creating and using custom hooks
│   │   ├── 03_Advanced/
│   │   │   ├── 01_Redux.md                  // Introduction to Redux; actions, reducers, store
│   │   │   ├── 02_Context_API_Advanced.md   // Advanced usage of context
│   │   │   ├── 03_Performance_Optimization.md// Memoization, lazy loading, React Profiler
│   │   │   └── 04_Router.md                 // React Router: setup,dynamic routing,protected routes
│   │   └── Frontend_Projects/
│   │       ├── 01_ToDo_App/                // Project structure, code files (React, CSS, assets)
│   │       ├── 02_Weather_App/
│   │       └── 03_ECommerce_Website/
├── Backend/
│   ├── Java_SpringBoot/
│   │   ├── 01_Basics/
│   │   │   ├── 01_Introduction.md           // Overview, setup, main class, Spring Boot annotations
│   │   │   ├── 02_Project_Structure.md      // Maven/Gradle configuration, folder organization
│   │   │   ├── 03_Application_Properties.md // application.properties vs. YAML
│   │   ├── 02_Web/
│   │   │   ├── 01_REST_API.md               // Building REST endpoints, controllers
│   │   │   ├── 02_Request_Mapping.md        // @GetMapping, @PostMapping, etc.
│   │   ├── 03_Data/
│   │   │   ├── 01_JPA_Basics.md             // Entities, repositories, CRUD operations
│   │   │   ├── 02_Relationships.md          // One-to-One, One-to-Many, etc.
│   │   │   └── 03_Transactions.md           // @Transactional, handling exceptions
│   │   ├── 04_Security/
│   │   │   ├── 01_Spring_Security_Basics.md   // Configuring Spring Security, basic auth
│   │   │   ├── 02_JWT_and_OAuth2.md          // Token-based security, JWT implementation
│   │   ├── 05_Advanced/
│   │   │   ├── 01_Microservices.md          // Breaking monoliths into microservices
│   │   │   ├── 02_Caching.md                // Implementing caching with Redis or similar
│   │   │   └── 03_Deployment.md             // Packaging, Docker, cloud deployment
│   │   └── Backend_Projects/
│   │       ├── 01_Blog_API/                // REST API for blog platform
│   │       ├── 02_ECommerce_Backend/
│   │       └── 03_Chat_Application/
│   ├── NodeJS_Express/ (optional for full-stack alternatives)
│   │   ├── 01_Basics/
│   │   │   ├── 01_Introduction.md
│   │   │   ├── 02_Setup.md
│   │   │   ├── 03_Routing.md
│   │   │   └── 04_Middleware.md
│   │   └── 02_Projects/
│   │       ├── 01_Todo_API/
│   │       └── 02_RealTime_Chat/
├── Database/
│   ├── MySQL/
│   │   ├── 01_Basics.md                   // Installing MySQL, basic CRUD queries, schema design
│   │   ├── 02_Advanced_Queries.md         // Joins, subqueries, indexing, optimization
│   │   └── 03_Admin_and_Security.md       // Backup, replication, user management
│   ├── NoSQL/
│   │   ├── 01_MongoDB_Basics.md           // Introduction, CRUD, aggregation
│   │   └── 02_Advanced_MongoDB.md         // Indexing, sharding, replication
├── DevOps/
│   ├── Version_Control/
│   │   ├── Git/
│   │   │   ├── 01_Basics.md               // Basic Git commands, workflows, remote repositories
│   │   │   ├── 02_Branching.md
│   │   │   ├── 03_Advanced.md             // Rebasing, cherry-picking, hooks
│   ├── Build_Tools/
│   │   ├── Maven.md                      // Maven fundamentals, multi-module projects, deployment
│   │   └── Gradle.md                     // Gradle fundamentals, custom tasks, CI integration
│   ├── Containerization/
│   │   ├── Docker.md                     // Docker basics, containerizing apps, Docker Compose
│   │   └── Kubernetes.md                 // Kubernetes fundamentals, deployment, scaling
│   ├── CI_CD/
│   │   ├── Jenkins.md                    // CI/CD pipelines, Jenkins basics
│   │   └── GitHub_Actions.md             // Automating builds and deployments
│   ├── API_Gateway/
│   │   ├── 01_Basics.md                  // What is an API Gateway? Key features and benefits
│   │   └── 02_Advanced.md                // Customization, scaling, integration with microservices
│   ├── Apache_Tomcat/
│   │   ├── 01_Setup.md                   // Installing and configuring Tomcat
│   │   ├── 02_Configuration.md           // server.xml, context.xml, clustering basics
│   │   └── 03_Security.md                // SSL/TLS, realms, best practices
│   └── System_Design/
│       ├── 01_Fundamentals.md            // Key principles, CAP theorem, scalability, reliability
│       ├── 02_Scalable_Design.md         // Load balancing, caching, data partitioning
│       └── 03_Advanced.md                // Distributed systems, microservices design, case studies
├── API_Tools/
│   ├── Postman/
│   │   ├── 01_Basics.md                  // Installing, making basic requests, collections
│   │   ├── 02_Intermediate.md            // Environments, variables, tests, scripts
│   │   └── 03_Advanced.md                // Monitors, automation, documentation generation
├── Interview_Preparation/
│   ├── 01_Frontend_Questions.md
│   ├── 02_Backend_Questions.md
│   ├── 03_FullStack_Questions.md
│   └── 04_System_Design.md
├── Resources/
│   ├── Books.md
│   ├── Courses.md
│   ├── Blogs.md
│   └── Tools.md
└── README.md
