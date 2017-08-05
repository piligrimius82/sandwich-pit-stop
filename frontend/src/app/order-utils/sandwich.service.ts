import { Sandwich} from "../entities/sandwich";
import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';

@Injectable()
export class SandwichService {

    private sandwichUrl = "api/sandwich";

    constructor(private http:Http){
    }

    updateSandwich(sandwich:Sandwich) {
        return this.http.put(this.sandwichUrl,sandwich);
    }
}

