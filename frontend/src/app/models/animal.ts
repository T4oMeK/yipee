export type Animal = {
    name: string;
    type: string;
    status: {
        happiness: number;
        isFed: boolean;
        isBrushed: boolean;
        isClean: boolean;
    }
}