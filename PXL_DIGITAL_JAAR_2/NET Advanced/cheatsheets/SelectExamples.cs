using LinqExamples.Models;
using System;
using System.Collections.Generic;
using System.Linq;

namespace LinqExamples
{
    public class SelectExamples
    {
        public IList<double> RoundDoublesUsingProjection(IEnumerable<double> doubles)
        {
            var convertedNumbers = from number in doubles
                select Convert.ToDouble(Convert.ToInt32(number));
            return convertedNumbers.ToList();
            //Tip: use the "ToList" extension method to convert an IEnumerable to a List
        }

        public IList<AngleInfo> ConvertAnglesToAngleInfos(IEnumerable<double> anglesInDegrees)
        {
            var convertedAngles = from angle in anglesInDegrees
                select new AngleInfo
                {
                    Angle = angle,
                    Cosinus = Math.Cos(angle * Math.PI / 180),
                    Sinus = Math.Sin(angle * Math.PI / 180)
                };
            return convertedAngles.ToList();
            
            //Tip: use the "ToList" extension method to convert an IEnumerable to a List
        }
    }
}
