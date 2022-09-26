import React from "react";
import styles from "./ChartBar.module.css";

const ChartBar = ({reviews, reviewCount}) => {
  let barFillWidth = "0%";

  if (reviewCount > 0) {
    barFillWidth = Math.round((reviews/ reviewCount) * 100) + "%";
  }

  return (
    <div className={styles.chartBar}>
      <div className={styles.chartBarInner}>
        <div
          className={styles.chartBarFill}
          style={{ width: barFillWidth }}
        ><span>{barFillWidth}</span></div>
      </div>
    </div>
  );
};

export default ChartBar;
