<template>
  <section class="pricing">
    <h1>Simple pricing</h1>
    <div class="plan transition-all hover:scale-105" @click="select('pro')">
      <h2>Pro plan</h2>
      <p>$29 per month</p>
      <img src="/pro.png" />
    </div>
  </section>
</template>

<script setup>
// const t = "Oops"
const select = (plan) => console.log(plan);
</script>
