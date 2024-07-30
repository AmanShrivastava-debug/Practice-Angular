// Define two arrays: one for names and another for salary
const empName: string[] = ['John', 'Alice', 'Bob', 'Eve', 'Charlie'];
const empSalary: number[] = [85000, 92000, 78000, 90000, 88000];

// Display names and salary using a for loop
console.log('Employee Names:');
for (let i = 0; i < empName.length; i++) {
    console.log(empName[i]);
}

console.log('\nEmployee Salary:');
for (let i = 0; i < empSalary.length; i++) {
    console.log(empSalary[i]);
}

// Display the average salary
const averageSalary: number = findAvg(empSalary);
console.log(`\nAverage Salary: ${averageSalary.toFixed(2)}`);

// index.ts
export function findAvg(sal: number[]): number {
    const totalSalary: number = sal.reduce((sum, sal) => sum + sal, 0);
    const averageSalary: number = totalSalary / sal.length;
    return averageSalary;
}


