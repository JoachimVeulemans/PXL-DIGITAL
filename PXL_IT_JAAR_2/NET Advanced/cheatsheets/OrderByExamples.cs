using System;
using System.Collections.Generic;
using System.Linq;
using LinqExamples.Models;

namespace LinqExamples
{
    public class OrderByExamples
    {
        public int[] SortNumbersDescending(int[] numbers)
        {
            var sortedNumbers = from number in numbers
                orderby number descending
                select number;
            return sortedNumbers.ToArray();
            //Tip: use the "ToArray" extension method to convert an IEnumerable to an Array
        }

        public IList<Person> SortPersonsOnDescendingAgeAndThenOnDescendingName(List<Person> persons)
        {
            var sortedPersons = from person in persons
                orderby person.Name descending
                orderby person.Age descending 
                select person;
            return sortedPersons.ToArray();
            //Tip: use the "ToList" extension method to convert an IEnumerable to a List
        }
    }
}