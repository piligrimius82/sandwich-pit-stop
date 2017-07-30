You will need to install Angular Material and Angular Animations for this to work properly

npm install --save @angular/material @angular/cdk
npm install --save @angular/animations

Since we opted for separate screens, I've placed each item selection into its own component. This will allow for some flexibility and extension later in the app. However, that presents problems with data persisitence.

We will only require once instance of "sandwich" every time the app loads and each component will need to have access to that instance. So I opted to create a SandwichService via sandwich.service.ts. This will house the sandwich instance and allow us to inject that service into the app.module.ts. This gives everything in the app access to the service. So, each component calls some function inside the SandwichService which will change the variables and allow the sandwich data to persist throughout the app.

I’m thinking we should be able to inject this same SandwichService into the Order Summary screen. Here we can create a sandwich object using the values from the SandwichService like the one already present in order-processing.component.ts. We can also change the other variables in this section as well. Then we can take the order object and pass that to the database.

Missing: proper feedback for the customer indicating their selection. There are console.log functions which will indicate that a selection has been made.
